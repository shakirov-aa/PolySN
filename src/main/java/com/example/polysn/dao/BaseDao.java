package com.example.polysn.dao;

import com.datastax.oss.driver.api.mapper.annotations.Insert;

/**
 * @author almaz.shakirov
 */
public interface BaseDao<T> {
    @Insert
    void save(T t);
}
