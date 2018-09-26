package com.jwt.uds.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.uds.app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
