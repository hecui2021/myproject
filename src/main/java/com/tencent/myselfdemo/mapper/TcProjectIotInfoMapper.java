package com.tencent.myselfdemo.mapper;

import com.tencent.myselfdemo.pojo.TcProjectIotInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TcProjectIotInfoMapper {

    int insert(TcProjectIotInfo tcProjectIotInfo);


}
