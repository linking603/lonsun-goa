package cn.lonsun.mapper;

import cn.lonsun.entity.Step;
import cn.lonsun.entity.StepExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface StepMapper {
    int countByExample(StepExample example);

    int deleteByExample(StepExample example);

    int deleteByPrimaryKey(BigDecimal stepId);

    int insert(Step record);

    int insertSelective(Step record);

    List<Step> selectByExample(StepExample example);

    Step selectByPrimaryKey(BigDecimal stepId);

    int updateByExampleSelective(@Param("record") Step record, @Param("example") StepExample example);

    int updateByExample(@Param("record") Step record, @Param("example") StepExample example);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);
}