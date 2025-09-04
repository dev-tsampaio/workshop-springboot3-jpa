package com.github.dev_tsampaio.projetowebservices.repositories;

import com.github.dev_tsampaio.projetowebservices.entities.Order;
import com.github.dev_tsampaio.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository // Não é necessario chamar essa notação, pq ela ja esta herdando da JPARepository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
