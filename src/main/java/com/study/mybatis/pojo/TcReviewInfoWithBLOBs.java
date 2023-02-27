package com.study.mybatis.pojo;

public class TcReviewInfoWithBLOBs extends TcReviewInfo {
    private String infoReviewDesc;

    private String performanceReviewDesc;

    private String functionReviewDesc;

    private String offReviewDesc;

    public String getInfoReviewDesc() {
        return infoReviewDesc;
    }

    public void setInfoReviewDesc(String infoReviewDesc) {
        this.infoReviewDesc = infoReviewDesc == null ? null : infoReviewDesc.trim();
    }

    public String getPerformanceReviewDesc() {
        return performanceReviewDesc;
    }

    public void setPerformanceReviewDesc(String performanceReviewDesc) {
        this.performanceReviewDesc = performanceReviewDesc == null ? null : performanceReviewDesc.trim();
    }

    public String getFunctionReviewDesc() {
        return functionReviewDesc;
    }

    public void setFunctionReviewDesc(String functionReviewDesc) {
        this.functionReviewDesc = functionReviewDesc == null ? null : functionReviewDesc.trim();
    }

    public String getOffReviewDesc() {
        return offReviewDesc;
    }

    public void setOffReviewDesc(String offReviewDesc) {
        this.offReviewDesc = offReviewDesc == null ? null : offReviewDesc.trim();
    }
}