/*
 * $Id: QueryDAO.java 252 2013-05-30 03:23:10Z fanyong.kfy $
 *
 * Copyright (c) 2013 zhichubao.com. All Rights Reserved.
 */

package com.github.acticfox.base.dao;

import java.util.List;
import java.util.Map;

/**
 * QueryDAO接口。
 * 
 * 用于执行查询类SQL的DAO接口。
 * 
 * 
 */
public interface QueryDAO {

    /**
     * 执行SQL并将结果转换为指定类型返回。
     * 
     * @param <E> 返回值类型
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param clazz 返回值类
     * @return SQL执行结果
     */
    <E> E executeForObject(String sqlID, Object bindParams, Class<E> clazz);

    /**
     * 执行SQL并将结果转换为Map返回。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果
     */
    Map<String, Object> executeForMap(String sqlID, Object bindParams);

    /**
     * 执行SQL并将结果转换为指定类型数组返回。
     * 
     * @param <E> 返回值类型
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param clazz 返回值类
     * @return SQL执行结果
     */
    <E> E[] executeForObjectArray(String sqlID,
            Object bindParams, Class<E> clazz);

    /**
     * 执行SQL并将结果转换为Map数组返回。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果
     */
    Map<String, Object>[] executeForMapArray(String sqlID, Object bindParams);

    /**
     * 执行SQL并将指定的结果集转换为指定类型数组返回。
     * 
     * @param <E> 返回值类型
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param clazz 返回值类
     * @param beginIndex 取数据开始Index
     * @param maxCount 取数据个数
     * @return SQL执行结果
     */
    <E> E[] executeForObjectArray(String sqlID,
            Object bindParams, Class<E> clazz, int beginIndex, int maxCount);

    /**
     * 执行SQL并将指定的结果集转换为Map数组返回。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param beginIndex 取数据开始Index
     * @param maxCount 取数据个数
     * @return SQL执行结果
     */
    Map<String, Object>[] executeForMapArray(String sqlID,
            Object bindParams, int beginIndex, int maxCount);

    /**
     * 执行SQL并将结果转换为指定类型列表返回。
     * 
     * @param <E> 返回值类型
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果
     */
    <E> List<E> executeForObjectList(String sqlID,
            Object bindParams);

    /**
     * 执行SQL并将结果转换为Map列表返回。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果
     */
    List<Map<String, Object>> executeForMapList(String sqlID,
            Object bindParams);

    /**
     * 执行SQL并将指定的结果集转换为指定类型列表返回。
     * 
     * @param <E> 返回值类型
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param beginIndex 取数据开始Index
     * @param maxCount 取数据个数
     * @return SQL执行结果
     */
    <E> List<E> executeForObjectList(String sqlID,
            Object bindParams, int beginIndex, int maxCount);

    /**
     * 执行SQL并将指定的结果集转换为Map列表返回。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param beginIndex 取数据开始Index
     * @param maxCount 取数据个数
     * @return SQL执行结果
     */
    List<Map<String, Object>> executeForMapList(String sqlID,
            Object bindParams, int beginIndex, int maxCount);
}