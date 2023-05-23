package com.kater.sfhw4.order.service;

import com.kater.sfhw4.order.repository.OrderDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDishService {
    private final OrderDishRepository orderDishRepository;

    @Autowired
    public OrderDishService(OrderDishRepository orderDishRepository) {
        this.orderDishRepository = orderDishRepository;
    }
}