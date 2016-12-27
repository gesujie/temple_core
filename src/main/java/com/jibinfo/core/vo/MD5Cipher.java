/**
 * jibinfo
 * 2016-06-28-下午4:33:38
 * 2016南京坚卓软件科技有限公司-版权所有
 */
package com.jibinfo.core.vo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Cipher {

	/*
	 * md5Js
	 */
	public static String md5Js(String text) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes());
			byte[] b = md.digest();

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				int i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
		}
		return null;
	}
}
