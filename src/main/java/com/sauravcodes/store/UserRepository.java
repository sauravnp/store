package com.sauravcodes.store;

public interface UserRepository {
    public void save(User user);
    public User findByEmail(String email);

}
