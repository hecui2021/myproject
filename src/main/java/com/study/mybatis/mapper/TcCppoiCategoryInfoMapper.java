package com.study.mybatis.mapper;

import com.study.mybatis.pojo.TcCppoiCategoryInfo;
import com.study.mybatis.pojo.TcCppoiCategoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcCppoiCategoryInfoMapper {
    long countByExample(TcCppoiCategoryInfoExample example);

    int deleteByExample(TcCppoiCategoryInfoExample example);

    int deleteByPrimaryKey(String categoryId);

    int insert(TcCppoiCategoryInfo record);

    int insertSelective(TcCppoiCategoryInfo record);

    List<TcCppoiCategoryInfo> selectByExample(TcCppoiCategoryInfoExample example);

    TcCppoiCategoryInfo selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") TcCppoiCategoryInfo record, @Param("example") TcCppoiCategoryInfoExample example);

    int updateByExample(@Param("record") TcCppoiCategoryInfo record, @Param("example") TcCppoiCategoryInfoExample example);

    int updateByPrimaryKeySelective(TcCppoiCategoryInfo record);

    int updateByPrimaryKey(TcCppoiCategoryInfo record);
}