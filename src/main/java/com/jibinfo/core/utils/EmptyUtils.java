/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author Show_Ge
 * @date 2015-11-23下午2:44:12
 * @description
 * EmptyUtils 
 * @version 1.0.0
 */
public class EmptyUtils {
	
	
	/**
	 * @author Show_Ge
	 * @date 2015-11-23下午2:47:06
	 * @description
	 * 判空<br>
	 * @param obj <font color='red'>String,Conllection,Map,Object[] 非这四种种情况,不可用......</font>
	 * @return obj != null && obj.isNotEmpty return false<br>
	 * 		   obj == null || obj.isEmpty    return true
	 */
	public static boolean isEmptyOrNull(Object obj){
		if(null != obj){
			//map 类型
			if(obj instanceof Map){
				Map<?,?> map= (Map<?,?>) obj;
				if(map.isEmpty()){
					return true;
				}
				return false;
			}
			//conllection 类型
			else if(obj instanceof Collection){
				Collection<?> con = (Collection<?>) obj;
				if(con.isEmpty()){
					return true;
				}
				return false;
			}
			//string 类型
			else if(obj instanceof String){
				String str = (String)obj;
				if(str.isEmpty()){
					return true;
				}
				return false;
			}
			//Object[] 类型
			else if(obj instanceof Object[]){
				Object[] strArr = (Object[])obj;
				if(strArr.length == 0){
					return true;
				}
				return false;
			}
			//其他类型
			else{
				return false;
			}
		}
		return true;
	}

}
