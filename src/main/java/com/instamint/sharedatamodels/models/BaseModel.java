package com.instamint.sharedatamodels.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseModel {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private final String UUID = generateUUID();
    private Date createdAt;

    public String generateUUID() {
        String uuid = java.util.UUID.randomUUID().toString();
        return uuid;
    }



    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }

}
