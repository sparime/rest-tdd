package com.bench.tdd.demo.tdddemo.user;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<SUser, Integer> {

    public SUser findSUserByUsername(String username);


}
