package com.study.mapper;

import com.study.pojo.TcProjectIotInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TcProjectIotInfoMapper {

    int insert(TcProjectIotInfo tcProjectIotInfo);


}
