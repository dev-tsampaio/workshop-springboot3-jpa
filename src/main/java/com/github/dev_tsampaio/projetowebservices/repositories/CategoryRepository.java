package com.github.dev_tsampaio.projetowebservices.repositories;

import com.github.dev_tsampaio.projetowebservices.entities.Category;
import com.github.dev_tsampaio.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// @Repository // Não é necessario chamar essa notação, pq ela ja esta herdando da JPARepository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
