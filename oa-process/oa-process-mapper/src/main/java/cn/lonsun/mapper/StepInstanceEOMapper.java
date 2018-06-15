package cn.lonsun.mapper;

import cn.lonsun.entity.StepInstanceEO;
import cn.lonsun.entity.StepInstanceEOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface StepInstanceEOMapper {
    int countByExample(StepInstanceEOExample example);

    int deleteByExample(StepInstanceEOExample example);

    int deleteByPrimaryKey(BigDecimal stepInstanceId);

    int insert(StepInstanceEO record);

    int insertSelective(StepInstanceEO record);

    List<StepInstanceEO> selectByExample(StepInstanceEOExample example);

    StepInstanceEO selectByPrimaryKey(BigDecimal stepInstanceId);

    int updateByExampleSelective(@Param("record") StepInstanceEO record, @Param("example") StepInstanceEOExample example);

    int updateByExample(@Param("record") StepInstanceEO record, @Param("example") StepInstanceEOExample example);

    int updateByPrimaryKeySelective(StepInstanceEO record);

    int updateByPrimaryKey(StepInstanceEO record);
}