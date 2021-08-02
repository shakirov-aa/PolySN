package com.example.polysn;

import com.datastax.oss.driver.api.core.CqlSession;
import com.example.polysn.dao.PolysnMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author almaz.shakirov
 */
@Configuration
public class AppContext {
    @Value("${cassandra.keyspace}")
    private String cassandraKeyspace;

    @Bean
    public CqlSession cqlSession() {
        return CqlSession.builder()
                .withKeyspace(cassandraKeyspace)
                .build();
    }

    @Bean
    public PolysnMapper dutubeMapper(CqlSession session) {
        return PolysnMapper.builder(session).build();
    }
}
