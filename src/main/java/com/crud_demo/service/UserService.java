package com.crud_demo.service;

import com.crud_demo.dao.UserDao;
import com.crud_demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    //按用户名查找
    public User getByUsername(String username){
        return userDao.findByUsername(username);
    }

    //按ID查找
    public User getByUserId(Integer id){
        return userDao.findByUserId(id);
    }



}
