package cn.lonsun.mapper;

import cn.lonsun.entity.StepEO;
import cn.lonsun.entity.StepEOExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface StepEOMapper {
    int countByExample(StepEOExample example);

    int deleteByExample(StepEOExample example);

    int deleteByPrimaryKey(BigDecimal stepId);

    int insert(StepEO record);

    int insertSelective(StepEO record);

    List<StepEO> selectByExample(StepEOExample example);

    StepEO selectByPrimaryKey(BigDecimal stepId);

    int updateByExampleSelective(@Param("record") StepEO record, @Param("example") StepEOExample example);

    int updateByExample(@Param("record") StepEO record, @Param("example") StepEOExample example);

    int updateByPrimaryKeySelective(StepEO record);

    int updateByPrimaryKey(StepEO record);
}