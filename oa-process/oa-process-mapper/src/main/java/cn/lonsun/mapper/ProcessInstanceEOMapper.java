package cn.lonsun.mapper;

import cn.lonsun.entity.ProcessInstanceEO;
import cn.lonsun.entity.ProcessInstanceEOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProcessInstanceEOMapper {
    int countByExample(ProcessInstanceEOExample example);

    int deleteByExample(ProcessInstanceEOExample example);

    int deleteByPrimaryKey(BigDecimal processInstanceId);

    int insert(ProcessInstanceEO record);

    int insertSelective(ProcessInstanceEO record);

    List<ProcessInstanceEO> selectByExample(ProcessInstanceEOExample example);

    ProcessInstanceEO selectByPrimaryKey(BigDecimal processInstanceId);

    int updateByExampleSelective(@Param("record") ProcessInstanceEO record, @Param("example") ProcessInstanceEOExample example);

    int updateByExample(@Param("record") ProcessInstanceEO record, @Param("example") ProcessInstanceEOExample example);

    int updateByPrimaryKeySelective(ProcessInstanceEO record);

    int updateByPrimaryKey(ProcessInstanceEO record);
}