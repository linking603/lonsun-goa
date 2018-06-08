package cn.lonsun.mapper;

import cn.lonsun.entity.ProcessInstance;
import cn.lonsun.entity.ProcessInstanceExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProcessInstanceMapper {
    int countByExample(ProcessInstanceExample example);

    int deleteByExample(ProcessInstanceExample example);

    int deleteByPrimaryKey(BigDecimal processInstanceId);

    int insert(ProcessInstance record);

    int insertSelective(ProcessInstance record);

    List<ProcessInstance> selectByExample(ProcessInstanceExample example);

    ProcessInstance selectByPrimaryKey(BigDecimal processInstanceId);

    int updateByExampleSelective(@Param("record") ProcessInstance record, @Param("example") ProcessInstanceExample example);

    int updateByExample(@Param("record") ProcessInstance record, @Param("example") ProcessInstanceExample example);

    int updateByPrimaryKeySelective(ProcessInstance record);

    int updateByPrimaryKey(ProcessInstance record);
}