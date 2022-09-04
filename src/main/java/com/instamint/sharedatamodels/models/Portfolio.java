package com.instamint.sharedatamodels.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Portfolio extends BaseModel {
    private String name;
    private String description;
}
