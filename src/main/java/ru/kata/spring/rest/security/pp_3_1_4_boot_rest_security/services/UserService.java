package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.services;

import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void saveUser(User user);
    void deleteById(Integer id);

    User findByEmail(String email);
    User findById(Integer id);

    void updateUser(User user);


}