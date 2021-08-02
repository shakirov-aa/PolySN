package com.example.polysn.dao;

import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.example.polysn.entity.User;

import java.util.UUID;

/**
 * @author almaz.shakirov
 */
@Dao
public interface UserDao extends BaseDao<User> {
    @Select
    User findById(UUID userId);
}
