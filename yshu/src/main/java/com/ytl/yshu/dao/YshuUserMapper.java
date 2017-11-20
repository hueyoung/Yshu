package com.ytl.yshu.dao;

import com.ytl.yshu.dao.po.YshuUser;
import com.ytl.yshu.dao.po.YshuUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YshuUserMapper {
    long countByExample(YshuUserExample example);

    int deleteByExample(YshuUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(YshuUser record);

    int insertSelective(YshuUser record);

    List<YshuUser> selectByExample(YshuUserExample example);

    YshuUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") YshuUser record, @Param("example") YshuUserExample example);

    int updateByExample(@Param("record") YshuUser record, @Param("example") YshuUserExample example);

    int updateByPrimaryKeySelective(YshuUser record);

    int updateByPrimaryKey(YshuUser record);
}