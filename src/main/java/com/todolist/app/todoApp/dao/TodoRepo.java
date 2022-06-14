package com.todolist.app.todoApp.dao;

import com.todolist.app.todoApp.entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepo extends JpaRepository<TodoItem,Integer> {

}
