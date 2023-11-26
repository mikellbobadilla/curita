package ar.mikellbobadilla.curita.config;

import ar.mikellbobadilla.curita.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@AllArgsConstructor
public class AppConfig {

    private AccountRepository accountRepository;

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder(10);
    }

    @Bean
    public UserDetailsService service() {
        var userNotFount = new UsernameNotFoundException("Usuario no encontrado");
        return username -> accountRepository.findByUsername(username)
                .orElseThrow(() -> userNotFount);
    }

    @Bean
    public AuthenticationProvider provider () {
        var provider = new DaoAuthenticationProvider(encoder());
        provider.setUserDetailsService(service());
        return provider;
    }

    @Bean
    public AuthenticationManager manager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
