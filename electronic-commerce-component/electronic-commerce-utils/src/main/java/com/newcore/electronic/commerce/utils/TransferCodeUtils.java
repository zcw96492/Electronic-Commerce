package com.newcore.electronic.commerce.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 字符串转码工具类
 * @author zhouchaowei
 * @date 2022-07-10
 */
public class TransferCodeUtils {

    private static final Logger logger = LoggerFactory.getLogger(TransferCodeUtils.class);

    /**
     * URI转码(针对汉字的密文转明文)
     * @param str 要转码的字符串
     * @param codeFormat 编码格式
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String urlDecoder(String str,String codeFormat) throws UnsupportedEncodingException {
        logger.info("获取的密文数据是：{}",str);
        return URLDecoder.decode(str, codeFormat);
    }

    /**
     * URI转码(针对汉字的明文转密文)
     * @param str 要转码的字符串
     * @param codeFormat 编码格式
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String urlEncoder(String str,String codeFormat) throws UnsupportedEncodingException {
        logger.info("获取的url是：{}",str);
        return URLEncoder.encode(str, codeFormat);
    }
}
