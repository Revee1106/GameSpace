package com.eric.gamespace.taoism.common.util;

import java.io.UnsupportedEncodingException;

import org.springframework.util.DigestUtils;

/**
 * MD5工具类
 * @author eric
 *
 */
public class MD5Util {
	
	/**
	 * MD5加密
	 * @param str
	 * @param key
	 * @param charSet
	 * @return
	 */
	public static String md5Encrypt(String str, String key, String charSet) {
		String oriStr = str + key;
		String encryptedString = DigestUtils.md5DigestAsHex(getContentBytes(oriStr, charSet));
		return encryptedString;
	}

	private static byte[] getContentBytes(String oriStr, String charSet) {
		if (charSet == null || "".equals(charSet)) {
            return oriStr.getBytes();
        }
        try {
            return oriStr.getBytes(charSet);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charSet);
        }
	}

}
