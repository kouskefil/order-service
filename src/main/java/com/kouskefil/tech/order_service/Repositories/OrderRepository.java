package com.kouskefil.tech.order_service.Repositories;

import com.kouskefil.tech.order_service.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
