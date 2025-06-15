package com.lily.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lily.project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByAccountId(String accountId);
}