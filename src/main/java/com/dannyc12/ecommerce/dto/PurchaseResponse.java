package com.dannyc12.ecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {
    // this class will just send back a java object as json
    private final String orderTrackingNumber;
}
