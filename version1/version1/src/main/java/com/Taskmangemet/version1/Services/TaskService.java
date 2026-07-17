package com.Taskmangemet.version1.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Taskmangemet.version1.Models.Task;
import com.Taskmangemet.version1.Repository.TaskRepository;


@Service
public class TaskService {
	@Autowired
	private  TaskRepository repo;
	
	public List<Task> getTasks() {
		
		
		return repo.findAll();
	}

	public Task addTask(Task task) {
		Task savedTask= repo.save(task);
		
		return savedTask;
	}

}
