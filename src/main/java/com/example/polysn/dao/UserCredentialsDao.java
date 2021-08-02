package com.example.polysn.dao;

import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.example.polysn.entity.UserCredentials;

/**
 * @author almaz.shakirov
 */
@Dao
public interface UserCredentialsDao extends BaseDao<UserCredentials> {
    @Select
    UserCredentials findById(String email);
}
