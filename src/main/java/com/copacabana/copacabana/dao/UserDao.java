package com.copacabana.copacabana.dao;

import com.copacabana.copacabana.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void delete(Long id);

    void post(User user);

    void put(User user, Long id);

    User opteinUser(User user);
}
