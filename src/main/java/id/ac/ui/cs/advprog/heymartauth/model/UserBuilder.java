package id.ac.ui.cs.advprog.heymartauth.model;

import java.lang.IllegalArgumentException;

public class UserBuilder {
    private String username;
    private String email;
    private String password;
    private String role;

    public UserBuilder username(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (username.length() < 4) {
            throw new IllegalArgumentException("Username must be at least 4 characters long");
        }
        if (!username.matches("^[a-zA-Z0-9_]*$")) {
            throw new IllegalArgumentException("Username can only contain letters, numbers, and underscore");
        }
        this.username = username;
        return this;
    }

    public UserBuilder email(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
        return this;
    }

    public UserBuilder password(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        this.password = password;
        return this;
    }

    public UserBuilder role(String role) {
        final String[] validRoles = {"CUSTOMER", "ADMIN", "MANAGER"};
        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be empty");
        }
        if (!java.util.Arrays.asList(validRoles).contains(role)) {
            throw new IllegalArgumentException("Invalid role");
        }
        this.role = role;
        return this;
    }

    public User build() {
        return new User(username, email, password, role);
    }
}

