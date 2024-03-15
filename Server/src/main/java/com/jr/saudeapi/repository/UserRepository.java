package com.jr.saudeapi.repository;

import com.jr.saudeapi.entity.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Gasto, Long> {
}
