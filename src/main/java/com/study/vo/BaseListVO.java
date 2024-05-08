package com.study.vo;

import lombok.Data;

import java.util.List;

@Data
public class BaseListVO<T> {
    private int total;

    private List<T> records;
}
