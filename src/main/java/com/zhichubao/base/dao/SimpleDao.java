/*
 * Copyright 2015 zhichubao.com All right reserved. This software is the confidential and proprietary information of
 * zhichubao.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered into with zhichubao.com .
 */
package com.zhichubao.base.dao;

import java.io.Serializable;
import java.util.List;

import com.github.acticfox.common.api.result.PageResult;

/**
 * 类SimpleDao.java的实现描述：
 * 
 * <pre>
 * 数据库基础操作DAO
 * </pre>
 * 
 * @author fanyong.kfy 2015年4月12日 下午5:17:00
 */
public interface SimpleDao<T> {

    /**
     * 根据ID查询对象
     * 
     * @param primaryKey 对象ID
     * @return 对象
     */
    public T queryById(Serializable primaryKey);

    /**
     * 插入数据
     * 
     * @param entity 数据信息
     * @return 影响行数
     */
    public int insert(T entity);

    /**
     * 更新对象
     * 
     * @param entity 数据信息
     * @return 影响行数
     */
    public int update(T entity);

    /**
     * 新增或修改对象
     * 
     * @param entity
     * @return 影响行数
     */
    public int saveOrUpdate(T entity);

    /**
     * 删除对象
     * 
     * @param primaryKey 对象ID
     * @return 影响行数
     */
    public int delete(Serializable primaryKey);

    /**
     * 分页查询
     * 
     * @param sqlId 主查询SqlID，CountSql的ID为 主查询SqlID + "Count"
     * @param bindParams 参数
     * @param pageNum 当前要查询的页数
     * @param pageSize 每页数据的行数
     * @return 分页对象
     */
    public <E> PageResult<E> queryPage(String sqlId, Object bindParams, int pageNum, int pageSize);

    /**
     * 批量更新或者插入数据
     * 
     * @param objectList
     * @param isInsert true表示插入数据，false表示更新数据
     * @return
     */
    void batchUpdateExecute(List<T> objectList, boolean isInsert);

}
