package id.ac.ui.cs.advprog.heymartauth.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class LoginUserDto {
    private String email;

    private String password;
}
