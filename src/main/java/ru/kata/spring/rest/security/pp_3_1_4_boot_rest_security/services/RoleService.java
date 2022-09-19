package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.services;

import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.Role;

import java.util.Set;

public interface RoleService {

    Set<Role> findAll();

    Role findByName(String name);

    void save(Role role);

    Role findById(Integer id);

}