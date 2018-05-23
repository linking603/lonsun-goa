package cn.lonsun.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AMockEntity {
    private String remarks;

    private Integer sortNum;

    private Short recordStatus;

    private Date createDate;

    private BigDecimal createUserId;

    private BigDecimal createOrginId;

    private BigDecimal createUnitId;

    private Date updateDate;

    private BigDecimal updateUserId;

    private BigDecimal updateOrginId;

    private BigDecimal updateUnitId;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Short getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Short recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(BigDecimal createUserId) {
        this.createUserId = createUserId;
    }

    public BigDecimal getCreateOrginId() {
        return createOrginId;
    }

    public void setCreateOrginId(BigDecimal createOrginId) {
        this.createOrginId = createOrginId;
    }

    public BigDecimal getCreateUnitId() {
        return createUnitId;
    }

    public void setCreateUnitId(BigDecimal createUnitId) {
        this.createUnitId = createUnitId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BigDecimal getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(BigDecimal updateUserId) {
        this.updateUserId = updateUserId;
    }

    public BigDecimal getUpdateOrginId() {
        return updateOrginId;
    }

    public void setUpdateOrginId(BigDecimal updateOrginId) {
        this.updateOrginId = updateOrginId;
    }

    public BigDecimal getUpdateUnitId() {
        return updateUnitId;
    }

    public void setUpdateUnitId(BigDecimal updateUnitId) {
        this.updateUnitId = updateUnitId;
    }
}
