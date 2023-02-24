package com.study.mapper;

import com.study.pojo.TcProjectIotInfo;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    List<TcProjectIotInfo> selectConfigList();

}
