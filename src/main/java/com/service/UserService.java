package com.service;

import com.model.User;

import java.util.List;

public interface UserService {

    List< User > getUsers();

    User save (User user);

    User create (User user) ;

    User getUser  (int Id) throws Exception;

    void deleteUser (int Id ) ;
}
