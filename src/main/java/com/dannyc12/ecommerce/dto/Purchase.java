package com.dannyc12.ecommerce.dto;

import com.dannyc12.ecommerce.entity.Address;
import com.dannyc12.ecommerce.entity.Customer;
import com.dannyc12.ecommerce.entity.Order;
import com.dannyc12.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
