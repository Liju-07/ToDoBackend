package com.nestdigital.ToDoBackend.Controller;

import com.nestdigital.ToDoBackend.Dao.UserDao;
import com.nestdigital.ToDoBackend.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
   private UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public String useradd(@RequestBody UserModel user){

        System.out.println(user.toString());
        dao.save(user);
        return "{status:success}";

    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<UserModel> userlogin(@RequestBody UserModel user){

        dao.getuser(user.getUsername(),user.getPassword());
        return (List<UserModel>) dao.getuser(user.getUsername(),user.getPassword());

    }

}
