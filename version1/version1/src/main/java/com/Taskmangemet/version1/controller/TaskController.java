package com.Taskmangemet.version1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Taskmangemet.version1.Models.Task;
import com.Taskmangemet.version1.Services.TaskService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class TaskController {
	@Autowired
	private  TaskService ser;
	
	@GetMapping("/")
	public String testing() {
		return "yooo it worked just fineeeeeeeeeeeeeeeeeeeeee";
	}

	@GetMapping("/tasks")
	
		public ResponseEntity<List<Task>> getallTasks(){
		
		
		return new ResponseEntity<>(ser.getTasks(), HttpStatus.OK);

}
	@PostMapping("/addTask")
	public ResponseEntity<?> addTasks(@RequestBody Task task) {
		try {
		Task newTask = ser.addTask(task);
				return new ResponseEntity<>(newTask, HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<> (e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
}
