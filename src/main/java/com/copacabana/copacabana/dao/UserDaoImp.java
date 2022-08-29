package com.copacabana.copacabana.dao;

import com.copacabana.copacabana.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void post(User user) {
        entityManager.merge(user);
    }

    @Override
    public void put(User user, Long id) {
        User user1 = entityManager.find(User.class, id);
        user1.setName(user.getName());
        user1.setIdentityCard(user.getIdentityCard());
        user1.setPassword(user.getPassword());
        user1.setPhone(user.getPhone());
        user1.setEmail(user.getEmail());
        user1.setWorkPositionCode(user.getWorkPositionCode());
        user1.setWorkFunctionCode(user.getWorkFunctionCode());
        entityManager.merge(user1);
    }

    @Override
    public User opteinUser(User user) {
        String query = "FROM User WHERE userName= :userName AND password=:password";
        List<User> list = entityManager.createQuery(query).setParameter("userName", user.getUserName()).setParameter("password", user.getPassword()).getResultList();
        return list.get(0);
    }
}
