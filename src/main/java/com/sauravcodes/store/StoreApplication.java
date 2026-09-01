package com.sauravcodes.store;

import com.sauravcodes.entities.Address;
import com.sauravcodes.entities.Tag;
import com.sauravcodes.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

       //ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .id(1L)
                .name("John")
                .email("John@gmail.com")
                .password("sdhf")
                .build();
        user.setName("John");
        user.setEmail("John@gmail.com");
        user.setPassword("sdhf");

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addTag("tag1");
        System.out.println(user);

    }

}
