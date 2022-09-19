package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String email);
}