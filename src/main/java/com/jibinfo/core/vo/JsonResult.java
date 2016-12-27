/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.vo;

import lombok.Data;

/**
 * @author Show_Ge
 * @date 2016-6-24下午3:48:21
 * @desr
 * ajax返回的json类型bean
 *
 */
@Data
public class JsonResult {
	private Boolean success = true;
	
	private String msg = "请求成功";
	
	private Object data;
}
