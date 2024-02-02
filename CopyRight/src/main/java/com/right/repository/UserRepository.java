package com.right.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.right.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
