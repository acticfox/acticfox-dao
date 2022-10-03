/*
 * $Id: IllegalClassTypeException.java 955 2013-06-29 11:07:58Z fanyong.kfy $
 *
 * Copyright (c) 2013 github.com. All Rights Reserved.
 */

package com.github.acticfox.base.dao;

import org.springframework.dao.DataAccessException;

/**
 * QueryDAO接口类型转换时发生的Runtime异常。
 * <p/>
 * 参数、返回值类型不一致、以及转换为Map数组时，由DAO实现抛出。
 * 
 * 
 */
public class IllegalClassTypeException extends DataAccessException {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 5542503630349130641L;

    /**
     * 错误消息
     */
    public static final String ERROR_ILLEGAL_CLASS_TYPE = "The illegal Class Type of the argument.";

    /**
     * 构造函数
     */
    public IllegalClassTypeException() {
        super(ERROR_ILLEGAL_CLASS_TYPE);
    }

    /**
     * 构造函数
     * 
     * @param message 消息
     */
    public IllegalClassTypeException(String message) {
        super(message);
    }

    /**
     * 构造函数
     * 
     * @param cause 异常原因
     */
    public IllegalClassTypeException(Throwable cause) {
        super(ERROR_ILLEGAL_CLASS_TYPE, cause);
    }

    /**
     * 构造函数
     * 
     * @param message 消息
     * @param cause 异常原因
     */
    public IllegalClassTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
