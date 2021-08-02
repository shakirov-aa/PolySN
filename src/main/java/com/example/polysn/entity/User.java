package com.example.polysn.entity;

import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

/**
 * @author almaz.shakirov
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @PartitionKey
    private UUID userId;
    private String lastName;
    private String firstName;
    private String email;
    private Instant createdDate;
}
