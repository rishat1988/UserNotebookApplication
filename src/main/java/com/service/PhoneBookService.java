package com.service;

import com.model.PhoneBook;

import java.util.List;

public interface PhoneBookService {

    List< PhoneBook > getPhoneBooks();

    void savePhoneBook(PhoneBook phoneBook) ;

    PhoneBook getPhoneBook  (int Id) throws Exception;

    void deletePhoneBook (int Id ) ;
}
