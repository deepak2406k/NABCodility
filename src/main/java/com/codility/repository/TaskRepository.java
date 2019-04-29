package com.codility.repository;

import com.codility.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public class TaskRepository extends JpaRepository<Task> {

  @Query("SELECT t FROM Task t WHERE t.COMPLETION_DATE IS NULL ORDER BY t.DUE_DATE")
  public List<Task> finAllOutstandingTask();

}
