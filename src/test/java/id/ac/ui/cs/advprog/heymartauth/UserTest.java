package id.ac.ui.cs.advprog.heymartauth;

import id.ac.ui.cs.advprog.heymartauth.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testUserBuilder() {
        User user = User.builder()
                .username("user")
                .email("user@email.com")
                .password("password")
                .role("CUSTOMER")
                .build();
        assertEquals("user", user.getUsername());
        assertEquals("user@email.com", user.getEmail());
        assertEquals("CUSTOMER", user.getRole());
    }

    @Test
    public void testUserBuilderWithInvalidRole() {
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder().role("MEOW");
        });
    }

    @Test
    public void testUserBuilderWithValidRole() {
        User user = User.builder()
                .role("CUSTOMER")
                .build();
        assertEquals("CUSTOMER", user.getRole());

        user = User.builder()
                .role("ADMIN")
                .build();

        assertEquals("ADMIN", user.getRole());

        user = User.builder()
                .role("MANAGER")
                .build();

        assertEquals("MANAGER", user.getRole());

    }


    @Test
    public void testUserBuilderWithInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .username("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .username(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .username(" ");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .username(" asd");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .username("as$df");
        });
    }

    @Test
    public void testUserBuilderWithInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email(" @email.com");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email("asdf");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email("asdf@");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email("asdf@.com");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .email("asdf@com");
        });
    }

    @Test
    public void testUserBuilderWithInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .password("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .password(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .password(" ");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .password(" asdf");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            User.builder()
                    .password("as$df");
        });
    }
}
