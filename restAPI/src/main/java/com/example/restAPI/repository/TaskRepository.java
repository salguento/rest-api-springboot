package com.example.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restAPI.model.Task;

@Repository
public interface TaskRepository  extends JpaRepository <Task, Long>{

}
