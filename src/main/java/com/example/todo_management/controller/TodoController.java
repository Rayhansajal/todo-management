package com.example.todo_management.controller;

import com.example.todo_management.dto.TodoDTO;
import com.example.todo_management.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private TodoService todoService;

    @PostMapping()
    public ResponseEntity<TodoDTO> addTodo( @RequestBody TodoDTO todoDTO) {
        TodoDTO savedTodo = todoService.addTodo(todoDTO);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoDTO> getTodo(@PathVariable("id") Long todoId){
        TodoDTO todoDTO = todoService.getTodo(todoId);
        return new ResponseEntity<>(todoDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TodoDTO>> getAllTodos() {
        List<TodoDTO> dtos = todoService.getAllTodo();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<TodoDTO> updateTodo( @RequestBody TodoDTO todoDTO , @PathVariable ("id") Long todoId){
        TodoDTO updatedTodo = todoService.updateTodo(todoDTO, todoId);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteTodo( @PathVariable ("id") Long todoId){
        todoService.deleteTodo(todoId);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @PatchMapping("{id}/complete")
    public ResponseEntity<TodoDTO> completeTodo(@PathVariable Long todoId){
        TodoDTO updatedTodo = todoService.completeTodo(todoId);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }

    @PatchMapping("{id}/incomplete")
    public ResponseEntity<TodoDTO> inCompleteTodo(@PathVariable Long todoId){
        TodoDTO updatedTodo = todoService.completeTodo(todoId);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }
}
