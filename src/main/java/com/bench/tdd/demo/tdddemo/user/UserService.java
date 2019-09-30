package com.bench.tdd.demo.tdddemo.user;

import java.util.List;

public interface UserService {
    public SUser getUserByName(String username);
    public void saveUser(SUser user);
    public List<SUser> getAllUsers();
}
