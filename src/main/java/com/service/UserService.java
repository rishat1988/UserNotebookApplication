package com.service;

import com.model.User;

import java.util.List;

public interface UserService {

    List< User > getUsers();

    void saveUser(User user) ;

    User getUser  (int Id) throws Exception;

    void deleteUser (int Id ) ;
}
