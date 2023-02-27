package com.study.mybatis.mapper;

import com.study.mybatis.pojo.TcProgramBasicInfo;
import com.study.mybatis.pojo.TcProgramBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcProgramBasicInfoMapper {
    long countByExample(TcProgramBasicInfoExample example);

    int deleteByExample(TcProgramBasicInfoExample example);

    int deleteByPrimaryKey(String programId);

    int insert(TcProgramBasicInfo record);

    int insertSelective(TcProgramBasicInfo record);

    List<TcProgramBasicInfo> selectByExample(TcProgramBasicInfoExample example);

    TcProgramBasicInfo selectByPrimaryKey(String programId);

    int updateByExampleSelective(@Param("record") TcProgramBasicInfo record, @Param("example") TcProgramBasicInfoExample example);

    int updateByExample(@Param("record") TcProgramBasicInfo record, @Param("example") TcProgramBasicInfoExample example);

    int updateByPrimaryKeySelective(TcProgramBasicInfo record);

    int updateByPrimaryKey(TcProgramBasicInfo record);
}