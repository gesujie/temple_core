package com.jibinfo.temple.mappers.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jibinfo.core.mappers.BaseMapper;
import com.jibinfo.temple.entity.system.SystemWebsite;
import com.jibinfo.temple.entity.system.SystemWebsiteExample;

public interface SystemWebsiteMapper extends BaseMapper<SystemWebsiteExample, SystemWebsite>{
    int countByExample(SystemWebsiteExample example);

    int deleteByExample(SystemWebsiteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemWebsite record);

    int insertSelective(SystemWebsite record);

    List<SystemWebsite> selectByExampleWithBLOBs(SystemWebsiteExample example);

    List<SystemWebsite> selectByExample(SystemWebsiteExample example);

    SystemWebsite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemWebsite record, @Param("example") SystemWebsiteExample example);

    int updateByExampleWithBLOBs(@Param("record") SystemWebsite record, @Param("example") SystemWebsiteExample example);

    int updateByExample(@Param("record") SystemWebsite record, @Param("example") SystemWebsiteExample example);

    int updateByPrimaryKeySelective(SystemWebsite record);

    int updateByPrimaryKeyWithBLOBs(SystemWebsite record);

    int updateByPrimaryKey(SystemWebsite record);
}