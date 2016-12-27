/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import com.alibaba.fastjson.JSONObject;
import com.jibinfo.core.constants.Constants;
import com.jibinfo.core.global.Variable;

/**
 * @author Show_Ge
 * @date 2016-6-22下午6:51:53
 * @desr
 * 统一打印System.out
 */
public class PrintlnUtils {
	/**
	 * @author Show_Ge
	 * @date 2016-6-22下午6:53:34
	 * @desr
	 * System.out/err
	 * @param obj
	 */
	public static void println(Object obj){
		if(Variable.SYSTEM_PRINTLN.equals(Constants.SYSTEM_PRINTLN_OUT)){
			System.out.println("<println out context> : "+JSONObject.toJSONString(obj));
		}
		else if(Variable.SYSTEM_PRINTLN.equals(Constants.SYSTEM_PRINTLN_ERR)){
			System.err.println("<println err context> : "+JSONObject.toJSONString(obj));
		}
	}
}
