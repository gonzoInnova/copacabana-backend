package com.copacabana.copacabana.dao;

import com.copacabana.copacabana.exception.Message;
import com.copacabana.copacabana.exception.MessageDescription;
import com.copacabana.copacabana.models.User;
import com.copacabana.copacabana.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional
    public List<User> getUsers(String type) {
        return userRepository.getUsersByType(type);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id).orElse(null);
        userRepository.delete(user);
    }

    @Override
    public void post(User userPost) {
        userRepository.save(userPost);
    }

    @Override
    public void put(User userPut) {
        User user = userRepository.findById(userPut.getId()).orElse(null );
        if (user==null){
            throw Message.GetNotFound(MessageDescription.UserNotFound);
        }
        BeanUtils.copyProperties(userPut,user);
        userRepository.save(user);
    }

    @Override
    public User getUser(User userGet) {
        return userRepository.getUserByUserNameAndPassword(userGet.getUserName(),userGet.getPassword()).orElse(null);
    }
}
