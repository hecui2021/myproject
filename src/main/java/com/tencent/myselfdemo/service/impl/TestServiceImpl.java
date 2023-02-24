package com.tencent.myselfdemo.service.impl;

import com.tencent.myselfdemo.mapper.TcProjectIotInfoMapper;
import com.tencent.myselfdemo.mapper.TestMapper;
import com.tencent.myselfdemo.pojo.TcProjectIotInfo;
import com.tencent.myselfdemo.service.TestService;
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
