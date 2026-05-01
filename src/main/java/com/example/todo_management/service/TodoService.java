package com.example.todo_management.service;

import com.example.todo_management.dto.TodoDTO;

import java.util.List;

public interface TodoService {
    TodoDTO addTodo(TodoDTO todoDTO);
    TodoDTO getTodo(Long id);
    List<TodoDTO> getAllTodo();
    TodoDTO updateTodo(TodoDTO todoDTO , Long id);
    void deleteTodo(Long id);
    TodoDTO completeTodo(Long id);
}
