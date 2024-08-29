package com.isdav11spring.service.impl;

import com.isdav11spring.model.Customer;
import com.isdav11spring.repository.CustomerRepository;
import com.isdav11spring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public String authenticate(String email, String password) {
        Customer customer = customerRepository.findCustomerByEmail(email);

        if (customer != null && customer.getPassword().equals(password)) {
            return "index";
        } else {
            return "redirect:/login";
        }
    }

    @Override
    public String changePassword(String email) {
//        Customer customer = customerRepository.findCustomerByEmail(email);
//        if (customer != null) {
//
//        } else {
//            return "redirect:/change-password";
//        }
        return "index";
    }
}
