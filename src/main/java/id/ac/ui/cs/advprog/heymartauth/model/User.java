package id.ac.ui.cs.advprog.heymartauth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class User {
    @Getter
    private String username;

    @Getter
    private String email;

    private String password;

    @Getter
    private String role;

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}

