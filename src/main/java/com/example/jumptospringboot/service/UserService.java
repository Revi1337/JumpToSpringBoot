package com.example.jumptospringboot.service;

import com.example.jumptospringboot.domain.SiteUser;
import com.example.jumptospringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        return userRepository.save(
                SiteUser.builder()
                        .username(username)
                        .email(email)
                        .password(passwordEncoder.encode(password))
                        .build()
        );
    }

    public SiteUser getUser(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new DataIntegrityViolationException("siteuser not found"));
    }

}
