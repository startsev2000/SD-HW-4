package com.kater.sfhw4.order.repository;

import com.kater.sfhw4.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}