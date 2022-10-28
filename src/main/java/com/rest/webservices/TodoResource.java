package com.rest.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.todo.Todo;
import com.rest.webservices.todo.TodoHardcodedService;

@RestController
public class TodoResource {
	
	
	@Autowired
	private TodoHardcodedService todoService;
	
	@GetMapping("/users/{username}/todos")
	public List <Todo> getAllTodos(@PathVariable String username){
		return todoService.findAll();
	}

}
