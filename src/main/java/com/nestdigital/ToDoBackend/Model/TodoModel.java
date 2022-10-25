package com.nestdigital.ToDoBackend.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class TodoModel {
    @Id
    @GeneratedValue
    public int id;
    public int userid;
    public String todo;
    public String date;


    public TodoModel(int id, int userid, String todo, String date) {
        this.id = id;
        this.userid = userid;
        this.todo = todo;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TodoModel() {
    }
}
