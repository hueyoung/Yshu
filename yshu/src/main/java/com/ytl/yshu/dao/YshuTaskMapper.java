package com.ytl.yshu.dao;

import com.ytl.yshu.dao.po.YshuTask;
import com.ytl.yshu.dao.po.YshuTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YshuTaskMapper {
    long countByExample(YshuTaskExample example);

    int deleteByExample(YshuTaskExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(YshuTask record);

    int insertSelective(YshuTask record);

    List<YshuTask> selectByExampleWithBLOBs(YshuTaskExample example);

    List<YshuTask> selectByExample(YshuTaskExample example);

    YshuTask selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") YshuTask record, @Param("example") YshuTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") YshuTask record, @Param("example") YshuTaskExample example);

    int updateByExample(@Param("record") YshuTask record, @Param("example") YshuTaskExample example);

    int updateByPrimaryKeySelective(YshuTask record);

    int updateByPrimaryKeyWithBLOBs(YshuTask record);

    int updateByPrimaryKey(YshuTask record);
}