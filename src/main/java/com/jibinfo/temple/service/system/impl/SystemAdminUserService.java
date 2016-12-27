/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.temple.service.system.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jibinfo.core.mappers.BaseMapper;
import com.jibinfo.core.service.impl.BaseService;
import com.jibinfo.temple.entity.system.SystemAdminUser;
import com.jibinfo.temple.entity.system.SystemAdminUserExample;
import com.jibinfo.temple.mappers.system.SystemAdminUserMapper;
import com.jibinfo.temple.service.system.ISystemAdminUserService;
@Service
public class SystemAdminUserService extends BaseService<SystemAdminUserExample, SystemAdminUser> implements ISystemAdminUserService {

	@Resource
	private SystemAdminUserMapper systemAdminUserMapper;
	
	@Override
	public BaseMapper<SystemAdminUserExample, SystemAdminUser> getMapper() {
		return systemAdminUserMapper;
	}


}
