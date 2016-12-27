/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.temple.service.system.impl;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Service;

import com.jibinfo.core.mappers.BaseMapper;
import com.jibinfo.core.service.impl.BaseService;
import com.jibinfo.temple.entity.system.SystemAdminUser;
import com.jibinfo.temple.entity.system.SystemAdminUserExample;
import com.jibinfo.temple.entity.system.SystemWebsite;
import com.jibinfo.temple.entity.system.SystemWebsiteExample;
import com.jibinfo.temple.mappers.system.SystemAdminUserMapper;
import com.jibinfo.temple.mappers.system.SystemWebsiteMapper;
import com.jibinfo.temple.service.system.ISystemWebsiteService;
@Service
//@Log4j
public class SystemWebsiteService extends BaseService<SystemWebsiteExample, SystemWebsite> implements ISystemWebsiteService {

	@Resource
	private SystemWebsiteMapper systemWebsiteMapper;
	@Resource
	private SystemAdminUserMapper systemAdminUserMapper;
	
	@Override
	public BaseMapper<SystemWebsiteExample, SystemWebsite> getMapper() {
		return systemWebsiteMapper;
	}

	@Override
	public SystemAdminUser findById(Long id) {
		SystemAdminUserExample example = new SystemAdminUserExample();
		example.createCriteria().andIdEqualTo(1L);
		List<SystemAdminUser> list = systemAdminUserMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public void saveExp() throws Exception {
//		SystemAdminUser user = new SystemAdminUser();
//		user.setBirthday(new Date());
//		user.setCreateDate(new Date());
//		user.setIsEmailConfirmed("1");
//		systemAdminUserMapper.insert(user);
		
		SystemWebsite record = new SystemWebsite();
		record.setCreatedDate(new Date());
		record.setDescription("描述");
		record.setDomain("www.haocheedai.com");
		record.setIcp("icp");
		record.setKeywords("keywords");
		record.setCopyright(UUID.randomUUID()+"");
		systemWebsiteMapper.insert(record);
		
	}


}
