package cn.lonsun.entity;

import java.math.BigDecimal;

public class StepInstanceEO extends AMockEntity {
    private BigDecimal stepInstanceId;

    private BigDecimal stepId;

    private String stepNickName;

    private BigDecimal processId;

    private String nextStepIds;

    public BigDecimal getStepInstanceId() {
        return stepInstanceId;
    }

    public void setStepInstanceId(BigDecimal stepInstanceId) {
        this.stepInstanceId = stepInstanceId;
    }

    public BigDecimal getStepId() {
        return stepId;
    }

    public void setStepId(BigDecimal stepId) {
        this.stepId = stepId;
    }

    public String getStepNickName() {
        return stepNickName;
    }

    public void setStepNickName(String stepNickName) {
        this.stepNickName = stepNickName == null ? null : stepNickName.trim();
    }

    public BigDecimal getProcessId() {
        return processId;
    }

    public void setProcessId(BigDecimal processId) {
        this.processId = processId;
    }

    public String getNextStepIds() {
        return nextStepIds;
    }

    public void setNextStepIds(String nextStepIds) {
        this.nextStepIds = nextStepIds == null ? null : nextStepIds.trim();
    }
}