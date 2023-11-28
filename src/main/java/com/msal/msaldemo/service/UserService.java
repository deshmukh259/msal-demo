package com.msal.msaldemo.service;

import com.msal.msaldemo.dao.UserDao;
import com.msal.msaldemo.dao.model.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public Userr getUser(int id) {
     return userDao.findById(id).orElse(new Userr());
    }

    public Userr addUser(Userr userr) {
        userDao.save(userr);
        return userr;
    }
}
