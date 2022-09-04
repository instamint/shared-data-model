package com.instamint.sharedatamodels.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asset extends BaseModel {

     // Auction
    private Boolean auction;
    private Float bestBid;
    private Float bestAsk;
    private String xref;


}
