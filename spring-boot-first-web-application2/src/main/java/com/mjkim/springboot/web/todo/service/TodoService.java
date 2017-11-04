package com.mjkim.springboot.web.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mjkim.springboot.web.todo.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "mjkim", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "mjkim", "Learn Spring RestTemplate", new Date(), false));
		todos.add(new Todo(3, "mjkim", "Learn Spring Boot", new Date(), false));
	}

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<>();
		for (Todo todo : todos) {
			System.out.println("todo.getUser(): " + todo.getUser() + ", user: " + user);
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}

		return filteredTodos;
	}

	public Todo retrieveTodo(int id) {
		for (Todo todo : todos) {
			if (todo.getId().equals(id)) {
				return todo;
			}
		}

		return null;
	}

	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

	public void addTodos(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}
