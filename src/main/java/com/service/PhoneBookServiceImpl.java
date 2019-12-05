package com.service;


import com.model.PhoneBook;
import com.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PhoneBookServiceImpl implements PhoneBookService {

    @Autowired
    private PhoneBookRepository phoneBookRepository;

    @Override
    public List< PhoneBook > getPhoneBooks(){return phoneBookRepository.findAll();}

    @Override
   public void savePhoneBook(PhoneBook phoneBook)  {phoneBookRepository.save(phoneBook);}

    @Override
   public PhoneBook getPhoneBook  (int id) throws Exception{
        return phoneBookRepository.findById(id).orElseThrow(() -> new Exception(String.valueOf(id)));
    }


    @Override
    public void deletePhoneBook (int id ) {
        phoneBookRepository.deleteById(id);

    }
}