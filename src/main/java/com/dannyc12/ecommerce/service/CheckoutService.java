package com.dannyc12.ecommerce.service;

import com.dannyc12.ecommerce.dto.Purchase;
import com.dannyc12.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
