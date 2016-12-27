/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Show_Ge
 * @date 2015-12-4上午8:36:07
 * @description
 * 读取properties 文件
 * @version 1.0.0
 */
public class PropertiesUtils {
	
	/**
	 * @author Show_Ge
	 * @date 2015-12-4上午8:38:56
	 * @description
	 * 根据filename读取properties文件
	 * @param filename
	 * @return
	 */
	private static Properties readProperties(String filename){
		Properties properties = new Properties();
		try {
			properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	
	/**
	 * @author Show_Ge
	 * @date 2015-12-4上午8:40:35
	 * @description
	 * 获取文件名是 filaname 中的某个key值对应的value
	 * @param filename     xxx.properties
	 * @param key          key值
	 * @return
	 */
	public static String getValueByProKey(String filename,String key){
		Properties properties = readProperties(filename);
		return properties.getProperty(key, null);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午8:55:09
	 * @description
	 * 根据properties文件名,读文件
	 * @param filename
	 * @return
	 */
	public static Map<String,String> getProFileName(String filename){
		Properties properties = readProperties(filename);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Map<String, String> map = new HashMap<String, String>((Map) properties); 
		return map;
	}
	
}
