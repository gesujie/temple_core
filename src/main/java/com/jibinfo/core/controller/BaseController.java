/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.controller;


import java.util.HashMap;
import java.util.Map;

import lombok.extern.log4j.Log4j;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.jibinfo.core.vo.JsonResult;
import com.jibinfo.core.vo.Paginator;


@Log4j
@ControllerAdvice
public class BaseController {
	/**
	 * @author Show_Ge
	 * @date 2016-6-23下午2:50:45
	 * @desr
	 * 设置分页信息
	 * @param pageNo   页数
	 * @param pageSize 每页条数
	 * @return
	 */
	protected Paginator setPaginator(int pageNo,int pageSize){
		Paginator paginator = new Paginator();
		// 设置页大小
		paginator.setItemsPerPage(pageSize);
		// 设置当前页
		paginator.setPage(pageNo);
		return paginator;
	}
	/**
	 * @author Show_Ge
	 * @date 2016-4-28下午2:22:25
	 * @desr
	 * 初始化返回数据map
	 * @return
	 */
	protected JsonResult getRespData(){
		JsonResult result = new JsonResult();
		return result;
	}
	/**
	 * @author Show_Ge
	 * @date 2016-4-28下午2:22:25
	 * @desr
	 * 设置错误的返回信息
	 * @return
	 */
	protected JsonResult setErrData(String msg){
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setMsg(msg);
		return result;
	}
	
}
