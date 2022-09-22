package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.User;

@RestController
@RequestMapping("/api/viewUser")
public class UserRestController {
    @GetMapping()
    public ResponseEntity<User> showUser(Authentication auth) {
        return new ResponseEntity<>((User) auth.getPrincipal(), HttpStatus.OK);
    }

}
