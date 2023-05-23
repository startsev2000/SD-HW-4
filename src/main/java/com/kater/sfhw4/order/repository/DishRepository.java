package com.kater.sfhw4.order.repository;

import com.kater.sfhw4.order.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
