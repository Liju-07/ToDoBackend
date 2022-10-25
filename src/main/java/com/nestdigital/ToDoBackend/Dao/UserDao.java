package com.nestdigital.ToDoBackend.Dao;

import com.nestdigital.ToDoBackend.Model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {

    @Query(value = "SELECT * FROM `users` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
    List<UserModel>getuser(String username,String password);
}
