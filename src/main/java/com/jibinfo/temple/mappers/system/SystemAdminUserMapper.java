package com.jibinfo.temple.mappers.system;

import com.jibinfo.core.mappers.BaseMapper;
import com.jibinfo.temple.entity.system.SystemAdminUser;
import com.jibinfo.temple.entity.system.SystemAdminUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdminUserMapper extends BaseMapper<SystemAdminUserExample, SystemAdminUser>{
    int countByExample(SystemAdminUserExample example);

    int deleteByExample(SystemAdminUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemAdminUser record);

    int insertSelective(SystemAdminUser record);

    List<SystemAdminUser> selectByExample(SystemAdminUserExample example);

    SystemAdminUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemAdminUser record, @Param("example") SystemAdminUserExample example);

    int updateByExample(@Param("record") SystemAdminUser record, @Param("example") SystemAdminUserExample example);

    int updateByPrimaryKeySelective(SystemAdminUser record);

    int updateByPrimaryKey(SystemAdminUser record);
}