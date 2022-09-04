package com.instamint.sharedatamodels.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AssetType extends BaseModel {
    @ManyToOne
    private Party owner;
    private String name;
    @javax.persistence.Column(length=10000)
    private String jsonSchema;

}
