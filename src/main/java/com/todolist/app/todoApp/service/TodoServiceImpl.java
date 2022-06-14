package com.todolist.app.todoApp.service;

import com.todolist.app.todoApp.entity.TodoItem;
import com.todolist.app.todoApp.dao.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService{

    private TodoRepo todoRepo;
    @Autowired
    public TodoServiceImpl(TodoRepo theTodoRepo){
        todoRepo=theTodoRepo;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @Override
    public TodoItem findById(int theId) {
        Optional<TodoItem> result = todoRepo.findById(theId);
        TodoItem theTodoItem=null;
        if( result.isPresent()){
            theTodoItem=result.get();
        }
        else {
            throw new RuntimeException("Didn`t find Todo Item id - "+theId);
        }
        return theTodoItem;
    }

    @Override
    public void save(TodoItem theTodoItem) {
        todoRepo.save(theTodoItem);
    }

    @Override
    public void deleteById(int theId) {
        todoRepo.deleteById(theId);
    }
}
