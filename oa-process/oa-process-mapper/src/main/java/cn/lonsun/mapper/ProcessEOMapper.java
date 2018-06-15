package cn.lonsun.mapper;

import cn.lonsun.entity.ProcessEO;
import cn.lonsun.entity.ProcessEOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProcessEOMapper {
    int countByExample(ProcessEOExample example);

    int deleteByExample(ProcessEOExample example);

    int deleteByPrimaryKey(BigDecimal processId);

    int insert(ProcessEO record);

    int insertSelective(ProcessEO record);

    List<ProcessEO> selectByExample(ProcessEOExample example);

    ProcessEO selectByPrimaryKey(BigDecimal processId);

    int updateByExampleSelective(@Param("record") ProcessEO record, @Param("example") ProcessEOExample example);

    int updateByExample(@Param("record") ProcessEO record, @Param("example") ProcessEOExample example);

    int updateByPrimaryKeySelective(ProcessEO record);

    int updateByPrimaryKey(ProcessEO record);
}