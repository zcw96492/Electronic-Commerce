package com.newcore.electronic.commerce.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambda表达式工具类
 * @author zhouchaowei
 * @date 2022-07-10
 */
public class LambdaCollectionUtils {

    private static final Logger logger = LoggerFactory.getLogger(LambdaCollectionUtils.class);

    /**
     * 截取集合前n个元素,并返回新集合
     * @param list 需要截取的集合
     * @param indexNum 截取元素个数
     * @param <T> 泛型
     * @return 包含前n个元素的新集合
     */
    public <T> List<T> firstIndex(List<T> list,int indexNum){
        return list.stream().limit(indexNum).collect(Collectors.toList());
    }

    /**
     * 将字符串List转换为带逗号的字符串
     * @param stringList 要转换的List
     * @return 带逗号的字符串
     */
    public static String transferToStrWithComma(List<String> stringList){
        return CollectionUtils.isEmpty(stringList)
                ? ""
                : stringList.stream().map(String::valueOf).collect(Collectors.joining(","));
    }
}
