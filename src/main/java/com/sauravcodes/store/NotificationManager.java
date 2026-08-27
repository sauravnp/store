package com.sauravcodes.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(@Qualifier("sms")NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification() {
        notificationService.send("do the work");
    }
}
