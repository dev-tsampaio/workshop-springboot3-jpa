package com.github.dev_tsampaio.projetowebservices.repositories;

import com.github.dev_tsampaio.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository // Não é necessario chamar essa notação, pq ela ja esta herdando da JPARepository
public interface UserRepository extends JpaRepository<User, Long> {
}
