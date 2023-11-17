package com.ll.reactspring.user.repository;

import com.ll.reactspring.user.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
