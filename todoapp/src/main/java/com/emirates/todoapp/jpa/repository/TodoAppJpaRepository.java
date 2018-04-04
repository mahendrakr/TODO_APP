package com.emirates.todoapp.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emirates.todoapp.domain.UserStoryJpa;

@Repository
public interface TodoAppJpaRepository extends JpaRepository<UserStoryJpa, Integer> {
	public List<UserStoryJpa> findByStatus(String status);
}
