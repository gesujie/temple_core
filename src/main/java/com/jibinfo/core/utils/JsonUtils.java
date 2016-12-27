/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.utils;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * @author Show_Ge
 * @date 2015-11-20上午9:58:47
 * @description
 * 
 * @version 1.0.0
 */
public class JsonUtils{
    public static final Gson gson = new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    
    public static String ObjToJson(Object obj)
    {
        return gson.toJson(obj);
    }

    @SuppressWarnings("unchecked")
    public static Object JsonToObj(String json,@SuppressWarnings("rawtypes") Class clazz)
    {
        return gson.fromJson(json, clazz);
    }
    
    public static List<String> jsonToList(String json)
    {
        Type t = new TypeToken<List<String>>(){}.getType();
        return gson.fromJson(json, t);
    }
    
    /** 
     * @param json
     * @param t  Type t = new TypeToken<List<Person>>(){}.getType();
     */
    public static <T> T JsonToType(String json,Type t)
    {
        return gson.fromJson(json, t);
    }
    /**
	 * 得到格式化json数据 退格用\t 换行用\r
	 */
	public static String formatText(String jsonStr) {
		int level = 0;
		StringBuffer jsonForMatStr = new StringBuffer();
		for (int i = 0; i < jsonStr.length(); i++) {
			char c = jsonStr.charAt(i);
			if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
				jsonForMatStr.append(getLevelStr(level));
			}
			switch (c) {
			case '{':
			case '[':
				jsonForMatStr.append(c + "\n");
				level++;
				break;
			case ',':
				jsonForMatStr.append(c + "\n");
				break;
			case '}':
			case ']':
				jsonForMatStr.append("\n");
				level--;
				jsonForMatStr.append(getLevelStr(level));
				jsonForMatStr.append(c);
				break;
			default:
				jsonForMatStr.append(c);
				break;
			}
		}
		return jsonForMatStr.toString();

	}

	/**
	 * 得到格式化json数据 退格用\t 换行用\r
	 */
	public static String formatHTML(String jsonStr) {
		int level = 0;
		StringBuffer jsonForMatStr = new StringBuffer();
		for (int i = 0; i < jsonStr.length(); i++) {
			char c = jsonStr.charAt(i);
			if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
				jsonForMatStr.append(getLevelHTML(level));
			}
			switch (c) {
			case '{':
			case '[':
				jsonForMatStr.append(c + "<br />");
				level++;
				break;
			case ',':
				jsonForMatStr.append(c + "<br />");
				break;
			case '}':
			case ']':
				jsonForMatStr.append("<br />");
				level--;
				jsonForMatStr.append(getLevelStr(level));
				jsonForMatStr.append(c);
				break;
			default:
				jsonForMatStr.append(c);
				break;
			}
		}
		return jsonForMatStr.toString();

	}
	private static String getLevelStr(int level) {
		StringBuffer levelStr = new StringBuffer();
		for (int levelI = 0; levelI < level; levelI++) {
			levelStr.append("\t");
		}
		return levelStr.toString();
	}
	
	private static String getLevelHTML(int level) {
		StringBuffer levelStr = new StringBuffer();
		for (int levelI = 0; levelI < level; levelI++) {
			levelStr.append("<br />&nbsp;&nbsp;&nbsp;&nbsp;");
		}
		return levelStr.toString();
	} 
	
	public static void main(String[] args) {
//		String jsonStr = "{\"id\":\"1\",\"name\":\"a1\",\"obj\":{\"id\":11,\"name\":\"a11\",\"array\":[{\"id\":111,\"name\":\"a111\"},{\"id\":112,\"name\":\"a112\"}]}}";
//		String fotmatStr = formatText(jsonStr);
//		WxUserOauth wuo = new WxUserOauth();
//		System.out.println(ObjToJson(wuo));
		List<String> openidList = new ArrayList<String>();
		openidList.add("0");
		openidList.add("1");
		openidList.add("2");
		openidList.add("3");
		openidList.add("4");
		openidList.add("5");
		openidList.add("6");
		openidList.add("7");
		openidList.add("8");
		openidList.add("9");
		openidList.add("10");
		openidList.add("11");
		openidList.add("12");
		openidList.add("13");
//		Object[] openidLis = Arrays.copyOfRange(openidList.toArray(), 10, 3);
		Object[] openidArr = openidList.toArray();
		int len = openidArr.length;//数组总长度
		int div = 5;
		int count = len / div;//循环次数
		if(len % div > 0)
			count++;
		for (int i = 0; i < count; i++) {
			int from = i * div;//启始下表
			int to = 0;
			if(i == count-1){
				to = len;//最后一次的结束下表
			}
			else{
				to = (i + 1) * div;//结束下表
			}
			Object[] newOpenidArr = Arrays.copyOfRange(openidArr, from , to);
			System.out.println(newOpenidArr);
		}
		
	} 
}
