package com.copacabana.copacabana.repositories;

import com.copacabana.copacabana.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long> {
    @Query(value = "select u from User u where u.userName=?1 and u.password=?2")
    Optional<User> getUserByUserNameAndPassword(String userName, String password);

    @Query(value = "select u from User u where u.name=?1")
    List<User> getUsersByName(String name);
    @Query(value = "select u from User u where u.typeCode=?1")
    List<User> getUsersByType(String type);

}
