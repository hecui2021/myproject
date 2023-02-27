package com.study.mybatis.pojo;

import java.util.Date;

public class TcCppoiInfo {
    private Integer cppoiId;

    private String poiId;

    private String cppoiApplyRecordId;

    private String cppoiApplyRecordName;

    private String title;

    private String address;

    private String csys;

    private Double longitude;

    private Double latitude;

    private String tel;

    private String contactTel;

    private String openTime;

    private String category;

    private String busiId;

    private String progId;

    private String progName;

    private String tpoiId;

    private Byte status;

    private Byte deliverStatus;

    private Byte deliverTimes;

    private Byte reduplicate;

    private Date mountTime;

    private Byte priority;

    private Byte isDelete;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Date lastModTime;

    private String categoryViewName;

    private String programAppId;

    private String poiStatus;

    private String poiInfoName;

    private Date endTime;

    public Integer getCppoiId() {
        return cppoiId;
    }

    public void setCppoiId(Integer cppoiId) {
        this.cppoiId = cppoiId;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId == null ? null : poiId.trim();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCsys() {
        return csys;
    }

    public void setCsys(String csys) {
        this.csys = csys == null ? null : csys.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
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

    public String getTpoiId() {
        return tpoiId;
    }

    public void setTpoiId(String tpoiId) {
        this.tpoiId = tpoiId == null ? null : tpoiId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(Byte deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public Byte getDeliverTimes() {
        return deliverTimes;
    }

    public void setDeliverTimes(Byte deliverTimes) {
        this.deliverTimes = deliverTimes;
    }

    public Byte getReduplicate() {
        return reduplicate;
    }

    public void setReduplicate(Byte reduplicate) {
        this.reduplicate = reduplicate;
    }

    public Date getMountTime() {
        return mountTime;
    }

    public void setMountTime(Date mountTime) {
        this.mountTime = mountTime;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
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

    public Date getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }

    public String getCategoryViewName() {
        return categoryViewName;
    }

    public void setCategoryViewName(String categoryViewName) {
        this.categoryViewName = categoryViewName == null ? null : categoryViewName.trim();
    }

    public String getProgramAppId() {
        return programAppId;
    }

    public void setProgramAppId(String programAppId) {
        this.programAppId = programAppId == null ? null : programAppId.trim();
    }

    public String getPoiStatus() {
        return poiStatus;
    }

    public void setPoiStatus(String poiStatus) {
        this.poiStatus = poiStatus == null ? null : poiStatus.trim();
    }

    public String getPoiInfoName() {
        return poiInfoName;
    }

    public void setPoiInfoName(String poiInfoName) {
        this.poiInfoName = poiInfoName == null ? null : poiInfoName.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}