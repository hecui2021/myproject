package com.study.mybatis.mapper;

import com.study.mybatis.pojo.TcCppoiApplyRecord;
import com.study.mybatis.pojo.TcCppoiApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcCppoiApplyRecordMapper {
    long countByExample(TcCppoiApplyRecordExample example);

    int deleteByExample(TcCppoiApplyRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(TcCppoiApplyRecord record);

    int insertSelective(TcCppoiApplyRecord record);

    List<TcCppoiApplyRecord> selectByExample(TcCppoiApplyRecordExample example);

    TcCppoiApplyRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") TcCppoiApplyRecord record, @Param("example") TcCppoiApplyRecordExample example);

    int updateByExample(@Param("record") TcCppoiApplyRecord record, @Param("example") TcCppoiApplyRecordExample example);

    int updateByPrimaryKeySelective(TcCppoiApplyRecord record);

    int updateByPrimaryKey(TcCppoiApplyRecord record);
}