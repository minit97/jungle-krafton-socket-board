package com.example.krafton_springboot.api.auth.repository;

import com.example.krafton_springboot.api.auth.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
