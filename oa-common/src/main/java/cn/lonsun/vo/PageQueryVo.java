package cn.lonsun.vo;

import java.io.Serializable;

public class PageQueryVo implements Serializable{
    /**
     * 页码 从0开始
     */
    private Integer pageIndex = 0;
    /**
     * 每页记录数 默认为15
     */
    private Integer pageSize = 15;
    /**
     * 排序字段名称
     */
    private String sortField;
    /**
     * 排序形式 asc  desc
     */
    private String sortOrder = "desc";

    /**
     * 显示正常数据, 1 正常数据  0 逻辑删除
     */
    private Integer recordStatus = 1;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }
}
