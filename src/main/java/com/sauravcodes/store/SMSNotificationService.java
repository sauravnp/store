package com.sauravcodes.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {

    @Override
    public void send(String message, String email) {
        System.out.println("SMS message sent: " + message);
    }
}
