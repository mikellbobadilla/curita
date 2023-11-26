package ar.mikellbobadilla.curita.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginForm {
    private String username;
    private String password;
}
