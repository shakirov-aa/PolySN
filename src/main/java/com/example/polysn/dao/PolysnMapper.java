package com.example.polysn.dao;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.mapper.MapperBuilder;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;

/**
 * @author almaz.shakirov
 */
@Mapper
public interface PolysnMapper {
    @DaoFactory
    UserCredentialsDao userCredentialsDao();

    @DaoFactory
    UserDao userDao();

    static MapperBuilder<PolysnMapper> builder(CqlSession session){
        return new PolysnMapperBuilder(session);
    }
}
