package com.copacabana.copacabana.controllers;

import com.copacabana.copacabana.dao.UserDao;
import com.copacabana.copacabana.models.User;
import com.copacabana.copacabana.util.JWTUtil;
import org.aspectj.weaver.patterns.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User user){
        User userLogged= userDao.opteinUser(user);
        if(userLogged !=null){
            String tokenJWT =jwtUtil.create(String.valueOf(userLogged.getId()), userLogged.getIdentityCard());
            return tokenJWT;
        }else {
            return "NOT OJ";
        }

    }
}
