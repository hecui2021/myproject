package com.study.pojo;

import lombok.Data;

@Data
public class TcProject {

    private String projectId;
    /**
     * 渠道号
     */
    private String channelId;
    /**
     * 车型名称
     */
    private String model;

    private String createBy;
    private Integer isDelete;
    private String createTime;
    private String updateTime;

}

