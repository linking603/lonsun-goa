package cn.lonsun.entity;

import java.math.BigDecimal;

public class Department extends AMockEntity {
    private BigDecimal departmentId;

    private String departmentFullName;

    private String departmentShortName;

    private Short departmentType;

    private BigDecimal departmentParentId;

    private String departmentParentIds;

    public BigDecimal getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigDecimal departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentFullName() {
        return departmentFullName;
    }

    public void setDepartmentFullName(String departmentFullName) {
        this.departmentFullName = departmentFullName == null ? null : departmentFullName.trim();
    }

    public String getDepartmentShortName() {
        return departmentShortName;
    }

    public void setDepartmentShortName(String departmentShortName) {
        this.departmentShortName = departmentShortName == null ? null : departmentShortName.trim();
    }

    public Short getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Short departmentType) {
        this.departmentType = departmentType;
    }

    public BigDecimal getDepartmentParentId() {
        return departmentParentId;
    }

    public void setDepartmentParentId(BigDecimal departmentParentId) {
        this.departmentParentId = departmentParentId;
    }

    public String getDepartmentParentIds() {
        return departmentParentIds;
    }

    public void setDepartmentParentIds(String departmentParentIds) {
        this.departmentParentIds = departmentParentIds == null ? null : departmentParentIds.trim();
    }
}