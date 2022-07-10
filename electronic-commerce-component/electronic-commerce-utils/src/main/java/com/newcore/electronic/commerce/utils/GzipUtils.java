package com.newcore.electronic.commerce.utils;

import com.newcore.electronic.commerce.utils.enumclass.BusinessExceptionCodeEnum;
import com.newcore.electronic.commerce.utils.enumclass.TranscodingEnum;
import com.newcore.electronic.commerce.utils.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Gzip压缩工具类
 * @author zhouchaowei
 * @date 2022-07-10
 */
public class GzipUtils {
    
    private static final Logger logger = LoggerFactory.getLogger(GzipUtils.class);

    /**
     * 对字符串进行Gzip压缩
     * @param compressStr 要压缩的字符串
     * @return
     */
    public static RestServerResponse<String> gzipString(String compressStr){
        Assert.notNull(compressStr,"要压缩的字符串不能为空");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gzipOutputStream.write(compressStr.getBytes(TranscodingEnum.UTF_8.getCode()));
            gzipOutputStream.finish();
            gzipOutputStream.close();
            String gzipStr = byteArrayOutputStream.toString(TranscodingEnum.ISO_8859_1.getCode());
            return RestServerResponse.createBySuccess("Gzip压缩成功",gzipStr,null);
        } catch (IOException e) {
            logger.error("market-common-utils || 工具类模块 || gzipString || 对字符串进行Gzip压缩方法 || Gzip压缩报错",e);
            throw new BusinessException(BusinessExceptionCodeEnum.FAIL.getCode(),BusinessExceptionCodeEnum.FAIL.getMessage());
        }
    }

    /**
     * 对Gzip压缩进行解压缩
     * @param decompressStr 要解压的字符串
     * @return
     */
    public static String unGzipString(String decompressStr) throws UnsupportedEncodingException {
        Assert.notNull(decompressStr,"要解压缩的字符串不能为空");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(decompressStr.getBytes(TranscodingEnum.ISO_8859_1.getCode()));
            GZIPInputStream gzipInputStream = new GZIPInputStream(in);
            byte [] buffer = new byte[1024];
            int off;
            while((off = gzipInputStream.read(buffer)) != -1){
                byteArrayOutputStream.write(buffer,0,off);
            }
        } catch (IOException e) {
            logger.error("market-common-utils || 工具类模块 || gzipString || 对Gzip压缩进行解压缩 || Gzip解压缩IO异常",e);
            throw new BusinessException(BusinessExceptionCodeEnum.FAIL.getCode(),BusinessExceptionCodeEnum.FAIL.getMessage());
        }
        return byteArrayOutputStream.toString(TranscodingEnum.UTF_8.getCode());
    }
}
