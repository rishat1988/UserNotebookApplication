package com.service;


import com.model.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {

        return userRepository.findAll();
    }

//    @Override
//    public  saveUser(User user) throws Exception {
//        return  userRepository.save(user);
//    }
@Override
public User save(User user)
{return userRepository.save(user);

}


    @Override
    public User create(User user) {
        return null;
    };

    @Override
    public User getUser(int id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception(String.valueOf(id)));
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}