package com.isdav11spring.config;

import com.isdav11spring.model.Customer;
import com.isdav11spring.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(customerRepository.count() == 0){
            var admin = new Customer()
                    .builder()
                    .email("admin@gmail.com")
                    .username("Admin")
                    .password("admin")
                    .phone("0123 456 789")
                    .build();
            var user = new Customer()
                    .builder()
                    .email("user@gmail.com")
                    .username("User")
                    .password("user")
                    .phone("987 654 321")
                    .build();
            customerRepository.saveAll(Arrays.asList(admin, user));
        }
    }
}
