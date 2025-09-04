package com.github.dev_tsampaio.projetowebservices.repositories;

import com.github.dev_tsampaio.projetowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
