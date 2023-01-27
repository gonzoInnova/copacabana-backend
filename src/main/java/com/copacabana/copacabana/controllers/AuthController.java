package com.copacabana.copacabana.controllers;

import com.copacabana.copacabana.dao.UserDao;
import com.copacabana.copacabana.models.Login;
import com.copacabana.copacabana.models.User;
import com.copacabana.copacabana.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JWTUtil jwtUtil;
    @CrossOrigin(origins = "http://localhost:9095")
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public Login login(@RequestBody User user){
        User userLogged= userDao.getUser(user);
        if(userLogged !=null){
            String tokenJWT =jwtUtil.create(String.valueOf(userLogged.getId()), userLogged.getIdentityCard());
            return new Login(tokenJWT,userLogged.getTypeCode(),userLogged.getName());
        }else {
            return new Login(null,null,null);
        }

    }
}
