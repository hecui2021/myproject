package com.study.mybatis.pojo;

import java.util.Date;

public class TcCppoiApplyRecord {
    private Integer recordId;

    private String cppoiApplyRecordId;

    private String cppoiApplyRecordName;

    private String cppoiApplyRecordDescribe;

    private Byte cppoiApplyReviewStatus;

    private String progId;

    private String progName;

    private Byte isDelete;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Byte status;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getCppoiApplyRecordId() {
        return cppoiApplyRecordId;
    }

    public void setCppoiApplyRecordId(String cppoiApplyRecordId) {
        this.cppoiApplyRecordId = cppoiApplyRecordId == null ? null : cppoiApplyRecordId.trim();
    }

    public String getCppoiApplyRecordName() {
        return cppoiApplyRecordName;
    }

    public void setCppoiApplyRecordName(String cppoiApplyRecordName) {
        this.cppoiApplyRecordName = cppoiApplyRecordName == null ? null : cppoiApplyRecordName.trim();
    }

    public String getCppoiApplyRecordDescribe() {
        return cppoiApplyRecordDescribe;
    }

    public void setCppoiApplyRecordDescribe(String cppoiApplyRecordDescribe) {
        this.cppoiApplyRecordDescribe = cppoiApplyRecordDescribe == null ? null : cppoiApplyRecordDescribe.trim();
    }

    public Byte getCppoiApplyReviewStatus() {
        return cppoiApplyReviewStatus;
    }

    public void setCppoiApplyReviewStatus(Byte cppoiApplyReviewStatus) {
        this.cppoiApplyReviewStatus = cppoiApplyReviewStatus;
    }

    public String getProgId() {
        return progId;
    }

    public void setProgId(String progId) {
        this.progId = progId == null ? null : progId.trim();
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName == null ? null : progName.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}