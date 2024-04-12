package id.ac.ui.cs.advprog.heymartauth;

import id.ac.ui.cs.advprog.heymartauth.model.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeymartAuthApplication {
    public static void main(String[] args) {
        User user = new User().builder()
                .username("user")
                .email("user@email.com")
                .password("password")
                .role("CUSTOMER")
                .build();
        SpringApplication.run(HeymartAuthApplication.class, args);
    }
}
