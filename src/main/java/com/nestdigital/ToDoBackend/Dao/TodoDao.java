package com.nestdigital.ToDoBackend.Dao;

import com.nestdigital.ToDoBackend.Model.TodoModel;
import com.nestdigital.ToDoBackend.Model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface TodoDao extends CrudRepository<TodoModel,Integer> {

    @Query(value = "SELECT * FROM `todo` WHERE `userid`=:userid",nativeQuery = true)
    List<Map<String,String>>viewdata(Integer userid);
}
