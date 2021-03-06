package cn.lonsun.service.impl;

import cn.lonsun.util.object.JsonUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lonsun.entity.*;
import cn.lonsun.mapper.*;
import cn.lonsun.service.api.*;
import cn.lonsun.vo.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DepartmentMapper departmentMapper;
    private DepartmentExample example = new DepartmentExample();

    @Override
    public Department getDepartmentByDepartmentId(BigDecimal departmentId) {
        example.createCriteria();
        example.andDepartmentIdEqualTo(departmentId);
        List<Department> list = departmentMapper.selectByExample(example);
        if (list != null && !list.isEmpty())
            return list.get(0);
        return null;
    }

    @Override
    public PaginationResultVo getDepartmentPaginationResult(PageQueryVo pageQueryVo) {
        long startTime = System.currentTimeMillis();
        PaginationResultVo result = null;
        if (StringUtils.isNotBlank(JedisClientUtil.jedisClientService.get("department"))) {
            result = JsonUtils.jsonToPojo(JedisClientUtil.jedisClientService.get("department"), PaginationResultVo.class);
        }
        if (result != null && result.getData() != null && !result.getData().isEmpty() &&
                result.getPageIndex().intValue() == pageQueryVo.getPageIndex() && result.getPageSize().intValue() == pageQueryVo.getPageSize()) {
            long endTime = System.currentTimeMillis();
            logger.info("当前程序耗时：" + (endTime - startTime) + "ms");
            return result;
        }
        //分页处理
        PageHelper.startPage(pageQueryVo.getPageIndex(), pageQueryVo.getPageSize());
        example.createCriteria();
        example.setOrderByClause("sort_num desc");
        //example.andDepartmentIdIn(Arrays.asList("30239437,30196719,30301960,30239643,".split(",")));
        List<Department> list = departmentMapper.selectByExample(example);
        PageInfo<Department> pageInfo = new PageInfo<>(list);
        //创建一个返回值对象
        result = new PaginationResultVo();
        result.setData(list);
        //取记录总条数
        result.setTotal(pageInfo.getTotal());
        result.setPageIndex(pageQueryVo.getPageIndex());
        result.setPageSize(pageQueryVo.getPageSize());
        result.setPageCount((long) pageInfo.getPages());
        //向缓存中添加内容
        //把PaginationResultVo转换成字符串
        String cacheString = JsonUtils.objectToJson(result);
        JedisClientUtil.jedisClientService.set("department", null, cacheString);

        long endTime = System.currentTimeMillis();
        logger.info("当前程序耗时：" + (endTime - startTime) + "ms");
        return result;
    }
}
