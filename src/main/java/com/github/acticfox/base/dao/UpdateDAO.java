/*
 * $Id: UpdateDAO.java 2688 2013-10-25 07:11:10Z fanyong.kfy $
 *
 * Copyright (c) 2013 zhichubao.com. All Rights Reserved.
 */

package com.github.acticfox.base.dao;

import java.util.List;

/**
 * UpdateDAO接口。
 * 
 * 用于执行更新类SQL的DAO接口。
 * 
 * 
 */
public interface UpdateDAO {

    /**
     * 执行SQL并返回执行结果个数。
     * 执行的SQL为insert, update, delete三种。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果个数
     */
    int execute(String sqlID, Object bindParams);
    
    /**
     * 执行SQL并返回执行结果个数,只允许更新一条记录。
     * 执行的SQL为insert, update, delete三种。
     * 
     * @param sqlID 执行的SQLID
     * @param bindParams SQL绑定参数
     * @return SQL执行结果个数
     */
    int executeUnique(String sqlID, Object bindParams);

    /**
     * 批量更新处理<br/>
     * 执行参数{@link SqlHolder}列表中的全部SQL。
     * 
     * @param sqlHolders 包含SQLID、SQL参数的SqlHolder实例列表
     * @return SQL执行结果个数
     */
    int executeBatch(List<SqlHolder> sqlHolders);
}
