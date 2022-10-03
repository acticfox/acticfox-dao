/*
 * $Id$
 *
 * Copyright (c) 2013 zhichubao.com. All Rights Reserved.
 */
package com.zhichubao.base.dao;

/**
 * QueryResultHandlerDAO接口。
 * 
 * 带有指定{@link DataRowHandler}数据结果处理类的查询接口
 * 
 * 
 */
public interface QueryRowHandlerDAO {

    /**
     * 使用{@link DataRowHandler}查询数据
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @param dataRowHandler 行数据处理逻辑
     */
    <T> void executeWithRowHandler(String sqlID, Object bindParams, DataRowHandler<T> dataRowHandler);
}
