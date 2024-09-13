package com.github.princeflaco.princebanking.services;

import com.github.princeflaco.princebanking.models.User;

import java.util.Set;

public interface IUserService {
    User Create(User user);
    Set<User> findAll();
    User findByUsername(String username);
    User findByEmail(String email);
    void delete(User user);
    User update(User user);
}
