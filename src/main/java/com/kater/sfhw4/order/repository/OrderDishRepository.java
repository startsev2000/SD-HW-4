package com.kater.sfhw4.order.repository;

import com.kater.sfhw4.order.model.OrderDish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDishRepository extends JpaRepository<OrderDish, Integer> {
}