/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {
	private static ApplicationContext staticapplicationcontext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		staticapplicationcontext = applicationContext;
	}

	public static Object getBean(String name) {
		if (staticapplicationcontext != null) {
			return staticapplicationcontext.getBean(name);
		}
		return null;
	}

	public static <T> T getBean(Class<T> clazz) {
		if (staticapplicationcontext != null) {
			return staticapplicationcontext.getBean(clazz);
		}
		return null;
	}

	public static ApplicationContext getApplicationContext() {
		return staticapplicationcontext;
	}
}