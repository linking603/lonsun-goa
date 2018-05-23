package cn.lonsun.vo;

import cn.lonsun.entity.AMockEntity;

import java.math.BigDecimal;

public class PersonInfoVo extends AMockEntity {
    private BigDecimal personId;

    private String personName;

    private Short personSex;

    private String personMobile;

    private String personPosition;

    private Short isMain;

    private String roleIds;

    private BigDecimal departmentOrganId;

    private String departmentOrganName;

    private BigDecimal departmentUnitId;

    private String departmentUnitName;

    private BigDecimal userId;

    private String userName;

    private String userPwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getDepartmentOrganName() {
        return departmentOrganName;
    }

    public void setDepartmentOrganName(String departmentOrganName) {
        this.departmentOrganName = departmentOrganName;
    }

    public String getDepartmentUnitName() {
        return departmentUnitName;
    }

    public void setDepartmentUnitName(String departmentUnitName) {
        this.departmentUnitName = departmentUnitName;
    }

    public BigDecimal getPersonId() {
        return personId;
    }

    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Short getPersonSex() {
        return personSex;
    }

    public void setPersonSex(Short personSex) {
        this.personSex = personSex;
    }

    public String getPersonMobile() {
        return personMobile;
    }

    public void setPersonMobile(String personMobile) {
        this.personMobile = personMobile == null ? null : personMobile.trim();
    }

    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition == null ? null : personPosition.trim();
    }

    public Short getIsMain() {
        return isMain;
    }

    public void setIsMain(Short isMain) {
        this.isMain = isMain;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds == null ? null : roleIds.trim();
    }

    public BigDecimal getDepartmentOrganId() {
        return departmentOrganId;
    }

    public void setDepartmentOrganId(BigDecimal departmentOrganId) {
        this.departmentOrganId = departmentOrganId;
    }

    public BigDecimal getDepartmentUnitId() {
        return departmentUnitId;
    }

    public void setDepartmentUnitId(BigDecimal departmentUnitId) {
        this.departmentUnitId = departmentUnitId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }
}