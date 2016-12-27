/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import java.util.Date;

import org.apache.log4j.Logger;


/**
 * @author Show_Ge
 * @date 2016-3-9上午9:06:25
 * @description
 * 日志打印处理类<br>
 * Log4j建议只使用四个级别，优先级从高到低分别是 ERROR、WARN、INFO、DEBUG
 * @version 1.0.0
 */
public class LogUtils {
	private static final Logger logger = Logger.getLogger(LogUtils.class);
	
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:13:45
	 * @description
	 * warn级别
	 * @param message
	 */
	public static void warn(Object message){
		logger.warn(new Date() +" - " + message);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:13:58
	 * @description
	 * warn级别
	 * @param message
	 * @param t
	 */
	public static void warn(Object message,Throwable t){
		logger.warn(new Date() +" - " + message, t);
	}
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:05
	 * @description
	 * debue级别
	 * @param message
	 */
	public static void debug(Object message){
		logger.debug(new Date() +" - " + message);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:15
	 * @description
	 * debue级别
	 * @param message
	 * @param t
	 */
	public static void debug(Object message,Throwable t){
		logger.debug(new Date() +" - " + message, t);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:22
	 * @description
	 * info级别
	 * @param message
	 */
	public static void info(Object message){
		logger.info(new Date() +" - " + message);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:30
	 * @description
	 * info级别
	 * @param message
	 * @param t
	 */
	public static void info(Object message,Throwable t){
		logger.info(new Date() +" - " + message, t);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:37
	 * @description
	 * error级别
	 * @param message
	 */
	public static void error(Object message){
		logger.error(new Date() +" - " + message);
	}
	
	/**
	 * @author Show_Ge
	 * @date 2016-3-9上午9:14:45
	 * @description
	 * error级别
	 * @param message
	 * @param t
	 */
	public static void error(Object message,Throwable t){
		logger.error(new Date() +" - " + message, t);
	}
}
