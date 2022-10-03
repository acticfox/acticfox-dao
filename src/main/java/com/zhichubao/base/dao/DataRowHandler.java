package com.zhichubao.base.dao;

/**
 * 行数据处理接口
 */
public interface DataRowHandler<T> {

    /**
     * 处理查询结果
     * 
     * @param object 查询结果数据
     */
    void handleRow(T object);
}
