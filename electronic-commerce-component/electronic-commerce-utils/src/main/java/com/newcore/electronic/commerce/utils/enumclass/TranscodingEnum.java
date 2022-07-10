package com.newcore.electronic.commerce.utils.enumclass;

/**
 * 编码格式的枚举类
 * @author zhouchaowei 
 */
public enum TranscodingEnum {

    UTF_8("UTF-8"),
    GBK("GBK"),
    ISO_8859_1("ISO-8859-1"),
    ISO_8859_2("ISO-8859-2"),
    ISO_8859_3("ISO-8859-3"),
    ISO_8859_4("ISO-8859-4"),
    ISO_8859_5("ISO-8859-5"),
    ISO_8859_6("ISO-8859-6"),
    ISO_8859_7("ISO-8859-7"),
    ISO_8859_8("ISO-8859-8"),
    ISO_8859_9("ISO-8859-9");

    private final String code;

    TranscodingEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
