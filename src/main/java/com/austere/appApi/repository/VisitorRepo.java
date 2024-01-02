package com.austere.appApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.austere.appApi.entity.Visitor;

@Repository
public interface VisitorRepo extends JpaRepository<Visitor, Integer>{
	
	@Query(value = "SELECT * FROM visitor WHERE user_id = :user_id", nativeQuery = true)
	List<Visitor> getVisitorData(@Param("user_id")Integer user_id);

	@Query(value = "SELECT * FROM visitor", nativeQuery = true)
	List<Visitor> getAllVisitorData();

	@Query(value = "SELECT is_admin FROM user WHERE id = :user_id", nativeQuery = true)
	Integer checkAdmin(@Param("user_id")Integer user_id);
	
	@Query(value = "SELECT * FROM visitor WHERE user_id = :user_id and check_flag = 1", nativeQuery = true)
	List<Visitor> getCheckInVisitorData(@Param("user_id")Integer user_id);

	@Query(value = "SELECT * FROM visitor WHERE check_flag = 1", nativeQuery = true)
	List<Visitor> getAllCheckInData();

}
