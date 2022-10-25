package com.nestdigital.ToDoBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue
    public int id;
    public String username;
    public String password;
    public String name;
    public int number;

    public UserModel(int id, String username, String password, String name, int number) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.number = number;
    }

    public UserModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
