package com.null_bank_backend.NullBank.repository;

import com.null_bank_backend.NullBank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
