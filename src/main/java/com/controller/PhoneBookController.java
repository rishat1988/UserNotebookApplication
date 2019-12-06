package com.controller;

import com.model.PhoneBook;
import com.model.User;
import com.service.PhoneBookService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PhoneBookController {
    @Autowired
    private UserService userService;
    @Autowired
    private PhoneBookService phoneBookService;

    @RequestMapping(value = "/phoneBook/{id}", method = RequestMethod.GET)
    public ResponseEntity<PhoneBook> getPhoneBook(@PathVariable Integer id) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(phoneBookService.getPhoneBook(id));
    }

    @RequestMapping(value = "/phoneBook/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PhoneBook> updatePhoneBook(@PathVariable Integer id, @RequestBody PhoneBook phoneBook) {
        return ResponseEntity.accepted().body(phoneBookService.save(phoneBook));
    }


    @RequestMapping(value = "/phoneBook/create", method = RequestMethod.POST)
    public ResponseEntity<PhoneBook> createphoneBook(@RequestBody PhoneBook phoneBook) {
        if (phoneBook == null) {
            return ResponseEntity.badRequest().body(phoneBook);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(phoneBookService.create(phoneBook));
    }

    @RequestMapping(value = "/phoneBook/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deletePhoneBook(@PathVariable Integer id) {
        phoneBookService.deletePhoneBook(id);
        return ResponseEntity.accepted().build();
    }



}
