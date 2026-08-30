package com.sauravcodes.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;


    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    public void registerUser(User user) {
        String email = user.getEmail();
        if(userRepository.findByEmail(email) != null) {
            throw new IllegalArgumentException("User with email " + email + " already exists");
        }
        userRepository.save(user);
        notificationService.send("You registerd successfully: " ,  email);
    }
}
