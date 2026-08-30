package com.sauravcodes.store;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{
    private final Map<String, User> users = new HashMap<>();


    @Override
    public void save(User user) {
        String email = user.getEmail();
        users.put(email, user);
        System.out.println("User saved");


    }
    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }

}
