package com.study.mybatis.pojo;

public class TcCppoiInfoWithBLOBs extends TcCppoiInfo {
    private String desc;

    private String shopPhotos;

    private String licensePhotos;

    private String extInfo;

    private String mountInfo;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getShopPhotos() {
        return shopPhotos;
    }

    public void setShopPhotos(String shopPhotos) {
        this.shopPhotos = shopPhotos == null ? null : shopPhotos.trim();
    }

    public String getLicensePhotos() {
        return licensePhotos;
    }

    public void setLicensePhotos(String licensePhotos) {
        this.licensePhotos = licensePhotos == null ? null : licensePhotos.trim();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }

    public String getMountInfo() {
        return mountInfo;
    }

    public void setMountInfo(String mountInfo) {
        this.mountInfo = mountInfo == null ? null : mountInfo.trim();
    }
}