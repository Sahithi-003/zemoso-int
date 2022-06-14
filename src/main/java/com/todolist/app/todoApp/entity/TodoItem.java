package com.todolist.app.todoApp.entity;

import javax.persistence.*;

@Entity
@Table(name="todolist")
public class TodoItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="status")
    private boolean status;

    public TodoItem(){

    }

    public TodoItem(int id, String title, boolean status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDone(boolean status) {
        this.status = status;
    }
}
