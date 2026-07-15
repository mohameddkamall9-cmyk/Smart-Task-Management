package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Task;
import Repository.TaskRepository;
@Service
public class TaskService {
	@Autowired
	private  TaskRepository repo;
	
	public List<Task> getTasks() {
		
		
		return repo.findAll();
	}

}
