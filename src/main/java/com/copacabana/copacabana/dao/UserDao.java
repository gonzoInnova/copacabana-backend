package com.copacabana.copacabana.dao;

import com.copacabana.copacabana.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers(String type);

    void delete(Long id);

    void post(User userPost);

    void put(User userPut);

    User getUser(User user);
}
