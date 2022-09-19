package ru.kata.spring.rest.security.pp_3_1_4_boot_rest_security.configs;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/logout").setViewName("redirect:/login?logout");

        registry.addViewController("/viewUser").setViewName("viewUser");
        registry.addViewController("/admin-panel").setViewName("admin-panel");

    }
}
