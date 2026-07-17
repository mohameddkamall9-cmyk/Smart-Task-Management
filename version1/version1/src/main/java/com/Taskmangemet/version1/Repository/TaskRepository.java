package com.Taskmangemet.version1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Taskmangemet.version1.Models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
	

}
