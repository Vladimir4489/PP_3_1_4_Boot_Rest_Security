package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security;

import org.springframework.stereotype.Component;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.Role;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.model.User;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.services.RoleService;
import ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.services.UserService;

import javax.annotation.PostConstruct;

@Component
public class InitUsersAndRoles {

    private final UserService userService;
    private final RoleService roleService;

    public InitUsersAndRoles(UserService userRepository, RoleService roleRepository) {
        this.userService = userRepository;
        this.roleService = roleRepository;
    }

    @PostConstruct
    public void createUsers() {
        Role user = new Role("ROLE_USER");
        Role admin = new Role("ROLE_ADMIN");

        roleService.save(user);
        roleService.save(admin);

        User user1 = new User("user1@mail.ru", "111");
        User user2 = new User("user2@mail.ru","111");
        User user3 = new User("user3@mail.ru", "111");

        user1.setRole(roleService.findByName("ROLE_ADMIN"));
        user1.setRole(roleService.findByName("ROLE_USER"));
        user2.setRole(roleService.findByName("ROLE_ADMIN"));
        user3.setRole(roleService.findByName("ROLE_USER"));


        user1.setFirstName("Vladimir");
        user1.setLastName("Karpov");


        user2.setFirstName("Tom");
        user2.setLastName("Kruz");


        user3.setFirstName("Forest");
        user3.setLastName("Gump");

        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);

    }
}