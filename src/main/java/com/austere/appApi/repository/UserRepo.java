package com.austere.appApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.austere.appApi.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
