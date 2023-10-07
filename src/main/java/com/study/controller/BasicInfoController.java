package com.study.controller;

import com.study.dto.BasicInfoDto;
import com.study.es.model.AccountBasicinfo;
import com.study.service.AccountBasicinfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author peterche
 * @Description
 * @Date 2023/9/4 15:11
 **/
@RestController
@RequestMapping("/basicinfo")
public class BasicInfoController {

    @Autowired
    private AccountBasicinfoService accountBasicinfoService;

    @PostMapping("/addData")
    public void addData(@RequestBody BasicInfoDto dto) {
        accountBasicinfoService.addData(dto.getChannelIdList().get(0),dto.getNum());
    }

    @PostMapping("/selectList")
    public List<AccountBasicinfo> selectList(@RequestBody BasicInfoDto dto) {
        return accountBasicinfoService.selectList(dto);
    }



}
