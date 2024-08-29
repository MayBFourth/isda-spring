package com.isdav11spring.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    String authenticate(String email, String password);

    String changePassword(String email);
}
