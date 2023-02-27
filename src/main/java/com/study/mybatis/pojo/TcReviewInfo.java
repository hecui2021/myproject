package com.study.mybatis.pojo;

import java.util.Date;

public class TcReviewInfo extends TcReviewInfoKey {
    private Byte reviewStatus;

    private Byte reviewType;

    private String programName;

    private String programId;

    private Byte infoReviewState;

    private Byte performanceReviewState;

    private Byte functionReviewState;

    private Byte offReviewState;

    private String programVersion;

    private String programVersionId;

    private String reviewTime;

    private Byte isDelete;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Byte getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Byte reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Byte getReviewType() {
        return reviewType;
    }

    public void setReviewType(Byte reviewType) {
        this.reviewType = reviewType;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId == null ? null : programId.trim();
    }

    public Byte getInfoReviewState() {
        return infoReviewState;
    }

    public void setInfoReviewState(Byte infoReviewState) {
        this.infoReviewState = infoReviewState;
    }

    public Byte getPerformanceReviewState() {
        return performanceReviewState;
    }

    public void setPerformanceReviewState(Byte performanceReviewState) {
        this.performanceReviewState = performanceReviewState;
    }

    public Byte getFunctionReviewState() {
        return functionReviewState;
    }

    public void setFunctionReviewState(Byte functionReviewState) {
        this.functionReviewState = functionReviewState;
    }

    public Byte getOffReviewState() {
        return offReviewState;
    }

    public void setOffReviewState(Byte offReviewState) {
        this.offReviewState = offReviewState;
    }

    public String getProgramVersion() {
        return programVersion;
    }

    public void setProgramVersion(String programVersion) {
        this.programVersion = programVersion == null ? null : programVersion.trim();
    }

    public String getProgramVersionId() {
        return programVersionId;
    }

    public void setProgramVersionId(String programVersionId) {
        this.programVersionId = programVersionId == null ? null : programVersionId.trim();
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
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
}