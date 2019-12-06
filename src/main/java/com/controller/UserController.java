package com.controller;


import com.model.PhoneBook;
import com.model.User;
import com.service.PhoneBookService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private PhoneBookService phoneBookService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable Integer id) throws Exception {
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.getUser(id));
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) {
        return ResponseEntity.accepted().body(userService.save(user));
    }


    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        if (user == null) {
            return ResponseEntity.badRequest().body(user);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.accepted().build();
    }




}
