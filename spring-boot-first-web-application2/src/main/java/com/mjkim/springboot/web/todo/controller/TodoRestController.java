package com.mjkim.springboot.web.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mjkim.springboot.web.todo.model.Todo;
import com.mjkim.springboot.web.todo.service.TodoService;

@RestController
public class TodoRestController {
	@Autowired
	private TodoService service;

	@RequestMapping(value = "/rest/todos", method = RequestMethod.GET)
	public List<Todo> listAllTodos() {
		List<Todo> users = service.retrieveTodos("mjkim");
		return users;
	}

	@RequestMapping(value = "/rest/todos/{id}", method = RequestMethod.GET)
	public Todo retrieveTodo(@PathVariable("id") int id) {
		return service.retrieveTodo(id);
	}
}
