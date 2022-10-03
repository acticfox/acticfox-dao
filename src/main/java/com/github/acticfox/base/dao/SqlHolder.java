/*
 * $Id$
 *
 * Copyright (c) 2013 github.com. All Rights Reserved.
 */

package com.github.acticfox.base.dao;

/**
 * SQL和参数保持类。
 * 
 * 用于<@link UpdateDAO#executeBatch(List)>方法。
 * 
 * 
 */
public class SqlHolder {

    /**
     * SQLID
     */
    protected String sqlID = null;

    /**
     * SQL参数
     */
    protected Object bindParams = null;

    /**
     * 构造函数。
     * @param sqlID SQLID
     * @param bindParams SQL参数
     */
    public SqlHolder(String sqlID, Object bindParams) {
        this.sqlID = sqlID;
        this.bindParams = bindParams;
    }

    /**
     * 取得SQLID。
     * @return SQLID
     */
    public String getSqlID() {
        return sqlID;
    }

    /**
     * 取得SQL参数。
     * @return SQL参数
     */
    public Object getBindParams() {
        return bindParams;
    }
}