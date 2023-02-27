package com.study.mybatis.mapper;

import com.study.mybatis.pojo.TcReviewInfo;
import com.study.mybatis.pojo.TcReviewInfoExample;
import com.study.mybatis.pojo.TcReviewInfoKey;
import com.study.mybatis.pojo.TcReviewInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcReviewInfoMapper {
    long countByExample(TcReviewInfoExample example);

    int deleteByExample(TcReviewInfoExample example);

    int deleteByPrimaryKey(TcReviewInfoKey key);

    int insert(TcReviewInfoWithBLOBs record);

    int insertSelective(TcReviewInfoWithBLOBs record);

    List<TcReviewInfoWithBLOBs> selectByExampleWithBLOBs(TcReviewInfoExample example);

    List<TcReviewInfo> selectByExample(TcReviewInfoExample example);

    TcReviewInfoWithBLOBs selectByPrimaryKey(TcReviewInfoKey key);

    int updateByExampleSelective(@Param("record") TcReviewInfoWithBLOBs record, @Param("example") TcReviewInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TcReviewInfoWithBLOBs record, @Param("example") TcReviewInfoExample example);

    int updateByExample(@Param("record") TcReviewInfo record, @Param("example") TcReviewInfoExample example);

    int updateByPrimaryKeySelective(TcReviewInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TcReviewInfoWithBLOBs record);

    int updateByPrimaryKey(TcReviewInfo record);
}