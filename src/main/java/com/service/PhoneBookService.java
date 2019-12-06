package com.service;

import com.model.PhoneBook;

import java.util.List;

public interface PhoneBookService {

    List< PhoneBook > getPhoneBooks();


    PhoneBook save (PhoneBook phoneBook);

    PhoneBook create (PhoneBook phoneBook) ;

    PhoneBook getPhoneBook  (int Id) throws Exception;

    void deletePhoneBook (int Id ) ;
}
