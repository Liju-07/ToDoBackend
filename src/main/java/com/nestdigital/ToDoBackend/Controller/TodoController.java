package com.nestdigital.ToDoBackend.Controller;


import com.nestdigital.ToDoBackend.Dao.TodoDao;
import com.nestdigital.ToDoBackend.Dao.UserDao;
import com.nestdigital.ToDoBackend.Model.TodoModel;
import com.nestdigital.ToDoBackend.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class TodoController {

    @Autowired
    private TodoDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addtodo",consumes = "application/json",produces = "application/json")
    public String useradd(@RequestBody TodoModel todo){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentdate=String.valueOf(dt.format(now));
        todo.setDate(currentdate);
        System.out.println(todo.toString());
         dao.save(todo);
        return "{status:success}";

    }
    @CrossOrigin("*")
    @PostMapping(path = "/viewtodo",consumes = "application/json",produces = "application/json")
    public List<Map<String,String>> viewtodo(@RequestBody TodoModel todo)
    {

        return (List<Map<String,String>>) dao.viewdata(todo.getUserid());

    }
}
