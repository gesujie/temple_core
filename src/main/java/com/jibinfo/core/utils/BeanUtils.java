/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;

/**
 * @author Show_Ge
 * @date 2016-3-10上午8:37:49
 * @description
 * bean工具类
 * @version 1.0.0
 */
public class BeanUtils {
	
    /**
     * @author Show_Ge
     * @date 2016-3-10上午8:38:12
     * @description
     * 把bean转成map
     * 因实体对象用annitation,导致转json报错,因为原有的实体对象里多了两个代理的类
     * hibernateLazyInitializer 和  handler
     * @param obj
     * @return
     */
    public static Map<String, Object> beanToMap(Object obj) { 
            Map<String, Object> params = new HashMap<String, Object>(0); 
            try { 
                PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean(); 
                PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj); 
                for (int i = 0; i < descriptors.length; i++) { 
                    String name = descriptors[i].getName(); 
                    System.out.println(name);
                    //hibernateLazyInitializer=org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer
                    //handler=org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer
                    if (!"class".equals(name) && !"handler".equals(name) && !"hibernateLazyInitializer".equals(name)) { 
                        params.put(name, propertyUtilsBean.getNestedProperty(obj, name)); 
                    } 
                } 
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
            return params; 
    }
    
    /**
     * @author Show_Ge
     * @date 2016-3-10上午8:38:40
     * @description
     * 把list<bean>转成list<map>
     * 同beanToMap
     * @param listObj
     * @return
     */
    public static List<Map<String,Object>> listBeanToListMap(List<?> listObj){
    	List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
    	if(null != listObj && listObj.size() > 0){
    		for (Object obj : listObj) {
    			listMap.add(beanToMap(obj));
			}
    	}
    	return listMap;
    }
    
    
}
