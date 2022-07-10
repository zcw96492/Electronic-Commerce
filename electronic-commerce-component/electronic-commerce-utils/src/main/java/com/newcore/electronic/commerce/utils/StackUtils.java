package com.newcore.electronic.commerce.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据结构-栈工具类
 * @author zhouchaowei
 * @date 2022-07-10
 */
public class StackUtils<T> {

    private static final Logger logger = LoggerFactory.getLogger(StackUtils.class);

    /** 指定栈顶元素指针,指向栈顶,用于栈的遍历 */
    private int top = -1;
    /** 栈的大小 */
    private int stackSize;
    /** 用于创建栈的数组 */
    private T [] stackArray;

    /**
     * 创建新的栈
     * @param array 栈大小
     */
    public void createStack(T [] array){
        setStackArray(array);
    }

    /**
     * 设值数组
     * @param stackArray 栈数组
     */
    private void setStackArray(T [] stackArray) {
        this.stackArray = stackArray;
        this.stackSize = stackArray.length;
    }

    /**
     * 查看栈中元素
     * @return
     */
    public T [] getStackArray() {
        return stackArray;
    }

    /**
     * 压栈操作
     * @param element 要压入栈的元素
     */
    public void push(T element){
        /** 在压入数据之前判断栈是否为满栈 */
        if(isFull()){
            logger.error("工具类工程 || 栈工具类 || 不能压栈 || 栈元素已满!!!");
        }else{
            stackArray [top + 1] = element;
            top++;
        }
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public T peek(){
        logger.info("工具类工程 || 栈工具类 || 查看栈顶元素 || 栈顶元素为:{}",stackArray[top]);
        return stackArray[top];
    }

    /**
     * 弹栈操作
     */
    public void pop(){
        if(isEmpty()){
            logger.error("工具类工程 || 栈工具类 || 不能弹栈 || 栈元素已空!!!");
        }else{
            stackArray[stackSize-1] = null;
            top--;
        }
    }

    /**
     * 判断栈是否为空
     * @return true-空栈,false-非空栈
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 判断栈是否为满栈
     * @return true-满栈,false-空栈
     */
    public boolean isFull(){
        if(stackSize != -1){
            return top == stackSize - 1;
        }else{
            logger.error("工具类工程 || 栈工具类 || 判断栈是否为满栈 || 没有栈元素,为空栈!!!");
            return false;
        }
    }
}
