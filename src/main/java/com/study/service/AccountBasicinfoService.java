package com.study.service;

import com.study.dto.BasicInfoDto;
import com.study.es.model.AccountBasicinfo;
import java.util.List;

public interface AccountBasicinfoService {

    List<AccountBasicinfo> selectList(BasicInfoDto dto);

}
