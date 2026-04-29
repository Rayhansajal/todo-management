package com.example.todo_management.service.impl;

import com.example.todo_management.dto.TodoDTO;
import com.example.todo_management.repository.TodoRepository;
import com.example.todo_management.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;

    @Override
    public TodoDTO addTodo(TodoDTO todoDTO) {
        return null;
    }
}
