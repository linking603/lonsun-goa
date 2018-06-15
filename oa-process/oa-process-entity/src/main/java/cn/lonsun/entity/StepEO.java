package cn.lonsun.entity;

import java.math.BigDecimal;

public class StepEO extends AMockEntity {
    private BigDecimal stepId;

    private String stepName;

    public BigDecimal getStepId() {
        return stepId;
    }

    public void setStepId(BigDecimal stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }
}