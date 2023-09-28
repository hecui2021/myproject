package com.study.service.impl;

import com.study.dto.BasicInfoDto;
import com.study.es.model.AccountBasicinfo;
import com.study.service.AccountBasicinfoService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @Author peterche
 * @Description
 * @Date 2023/9/28 15:40
 **/
@Service
public class AccountBasicinfoServiceImpl implements AccountBasicinfoService {

    @Override
    public List<AccountBasicinfo> selectList(BasicInfoDto dto) {
        return null;
    }
}
