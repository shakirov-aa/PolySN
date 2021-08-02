package com.example.polysn.entity;

import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author almaz.shakirov
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {
    @PartitionKey
    private String email;
    private String password;
    private UUID userId;
}
