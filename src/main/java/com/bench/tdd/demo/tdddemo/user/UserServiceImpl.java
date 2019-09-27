package com.bench.tdd.demo.tdddemo.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public SUser getUserByName(String username) {
        return userRepository.findSUserByUsername(username);
    }
}
