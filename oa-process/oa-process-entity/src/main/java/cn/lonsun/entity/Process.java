package cn.lonsun.entity;

import java.math.BigDecimal;

public class Process extends AMockEntity {
    private BigDecimal processId;

    private String processName;

    private BigDecimal processType;

    private Short processStatus;

    private BigDecimal formId;

    public BigDecimal getProcessId() {
        return processId;
    }

    public void setProcessId(BigDecimal processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public BigDecimal getProcessType() {
        return processType;
    }

    public void setProcessType(BigDecimal processType) {
        this.processType = processType;
    }

    public Short getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Short processStatus) {
        this.processStatus = processStatus;
    }

    public BigDecimal getFormId() {
        return formId;
    }

    public void setFormId(BigDecimal formId) {
        this.formId = formId;
    }
}