package com.tencent.myselfdemo.mapper;

import com.tencent.myselfdemo.pojo.TcProjectIotInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    List<TcProjectIotInfo> selectConfigList();

}
