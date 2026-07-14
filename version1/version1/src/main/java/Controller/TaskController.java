package Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.Task;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TaskController {
	@Autowired
	private final  Service service;
	
	@GetMapping("/")
	public String testing() {
		return "yooo it worked just fineeeeeeeeeeeeeeeeeeeeee";
	}

	@GetMapping("/tasks")
	
		public ResponseEntity<List<Task>> getallTasks(){
		
		
		return new ResponseEntity<>(service.getTasks(), HttpStatus.OK);

}
}