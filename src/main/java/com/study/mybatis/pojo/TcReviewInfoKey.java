package com.study.mybatis.pojo;

public class TcReviewInfoKey {
    private String reviewId;

    private String programAppId;

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    public String getProgramAppId() {
        return programAppId;
    }

    public void setProgramAppId(String programAppId) {
        this.programAppId = programAppId == null ? null : programAppId.trim();
    }
}