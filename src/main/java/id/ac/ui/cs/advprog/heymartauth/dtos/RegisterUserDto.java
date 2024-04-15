package id.ac.ui.cs.advprog.heymartauth.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegisterUserDto {
    private String email;

    private String password;

    private String username;
}
