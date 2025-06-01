package com.lily.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lily.project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}