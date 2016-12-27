/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.temple.service.system;

import com.jibinfo.core.service.IBaseService;
import com.jibinfo.temple.entity.system.SystemAdminUser;
import com.jibinfo.temple.entity.system.SystemWebsite;
import com.jibinfo.temple.entity.system.SystemWebsiteExample;

public interface ISystemWebsiteService extends IBaseService<SystemWebsiteExample, SystemWebsite>{
	
	SystemAdminUser findById(Long id);
	
	void saveExp()  throws Exception ;
	
}
