package com.copacabana.copacabana.controllers;

import com.copacabana.copacabana.dao.UserDao;
import com.copacabana.copacabana.exception.Message;
import com.copacabana.copacabana.exception.MessageDescription;
import com.copacabana.copacabana.models.User;
import com.copacabana.copacabana.util.JWTUtil;
import org.apache.tomcat.util.http.parser.Authorization;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JWTUtil jwtUtil;


    @RequestMapping(value = "api/users/{type}", method = RequestMethod.GET)
    public List<User> getUsers(@RequestHeader(value = "Authorization") String token,@PathVariable String type){
        jwtUtil.getKey(token);
        return userDao.getUsers(type);
    }


    @RequestMapping(value = "api/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@RequestHeader(value="Authorization") String token,@PathVariable Long id){
        jwtUtil.getKey(token);
         userDao.delete(id);
    }
    @RequestMapping(value = "api/users", method = RequestMethod.POST)
    public void postUser(@RequestHeader(value="Authorization") String token,@RequestBody User user){
        jwtUtil.getKey(token);
         userDao.post(user);
    }
    @RequestMapping(value = "api/users", method = RequestMethod.PUT)
    public void putUser(@RequestHeader(value="Authorization") String token,@RequestBody User user){
        jwtUtil.getKey(token);
        userDao.put(user);
    }
}
