package com.study.service.impl;

import com.study.pojo.TcProjectIotInfo;
import com.study.mapper.TcProjectIotInfoMapper;
import com.study.mapper.TestMapper;
import com.study.service.TestService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TcProjectIotInfoMapper tcProjectIotInfoMapper;

    @Override
    public String mvData() {
        List<TcProjectIotInfo> iotInfoList = testMapper.selectConfigList();
        log.info("---------size:"+iotInfoList.size());
        for(TcProjectIotInfo iot : iotInfoList){
            iot.setFromWhere("内部申请");
            iot.setReviewStatus("PASSED");
            tcProjectIotInfoMapper.insert(iot);
        }





        log.info("-------success--------");


        return null;
    }
}
