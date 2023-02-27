package com.study.mybatis.mapper;

import com.study.mybatis.pojo.TcCppoiInfo;
import com.study.mybatis.pojo.TcCppoiInfoExample;
import com.study.mybatis.pojo.TcCppoiInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcCppoiInfoMapper {
    long countByExample(TcCppoiInfoExample example);

    int deleteByExample(TcCppoiInfoExample example);

    int deleteByPrimaryKey(Integer cppoiId);

    int insert(TcCppoiInfoWithBLOBs record);

    int insertSelective(TcCppoiInfoWithBLOBs record);

    List<TcCppoiInfoWithBLOBs> selectByExampleWithBLOBs(TcCppoiInfoExample example);

    List<TcCppoiInfo> selectByExample(TcCppoiInfoExample example);

    TcCppoiInfoWithBLOBs selectByPrimaryKey(Integer cppoiId);

    int updateByExampleSelective(@Param("record") TcCppoiInfoWithBLOBs record, @Param("example") TcCppoiInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TcCppoiInfoWithBLOBs record, @Param("example") TcCppoiInfoExample example);

    int updateByExample(@Param("record") TcCppoiInfo record, @Param("example") TcCppoiInfoExample example);

    int updateByPrimaryKeySelective(TcCppoiInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TcCppoiInfoWithBLOBs record);

    int updateByPrimaryKey(TcCppoiInfo record);
}