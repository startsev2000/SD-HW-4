package com.kater.sfhw4.order.controller;

import com.kater.sfhw4.order.service.DishService;
import com.kater.sfhw4.order.service.OrderDishService;
import com.kater.sfhw4.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private final OrderDishService orderDishService;
    private final DishService dishService;

    @Autowired
    public OrderController(OrderService orderService, OrderDishService orderDishService, DishService dishService) {
        this.orderService = orderService;
        this.orderDishService = orderDishService;
        this.dishService = dishService;
    }
}