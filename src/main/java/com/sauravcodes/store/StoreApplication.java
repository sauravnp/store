package com.sauravcodes.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);
        //var manager = context.getBean(NotificationManager.class);
        orderService.placeOrder();
        //manager.sendNotification();
        //var resource = context.getBean(HeavyResource.class);
        context.close();
    }

}
