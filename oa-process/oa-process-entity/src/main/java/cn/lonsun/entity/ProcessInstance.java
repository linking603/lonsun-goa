package cn.lonsun.entity;

import java.math.BigDecimal;

public class ProcessInstance extends AMockEntity {
    private BigDecimal processInstanceId;

    private BigDecimal processId;

    private String processNickName;

    private BigDecimal departmentUnitId;

    private BigDecimal departmentOrganId;

    public BigDecimal getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(BigDecimal processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public BigDecimal getProcessId() {
        return processId;
    }

    public void setProcessId(BigDecimal processId) {
        this.processId = processId;
    }

    public String getProcessNickName() {
        return processNickName;
    }

    public void setProcessNickName(String processNickName) {
        this.processNickName = processNickName == null ? null : processNickName.trim();
    }

    public BigDecimal getDepartmentUnitId() {
        return departmentUnitId;
    }

    public void setDepartmentUnitId(BigDecimal departmentUnitId) {
        this.departmentUnitId = departmentUnitId;
    }

    public BigDecimal getDepartmentOrganId() {
        return departmentOrganId;
    }

    public void setDepartmentOrganId(BigDecimal departmentOrganId) {
        this.departmentOrganId = departmentOrganId;
    }
}