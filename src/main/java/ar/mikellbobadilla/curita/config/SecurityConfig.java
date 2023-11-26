package ar.mikellbobadilla.curita.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {

    private final AuthenticationProvider provider;

    @Bean
    public SecurityFilterChain chain(HttpSecurity http) throws Exception {

        /* Login config */
        http.formLogin(login -> {
            login.loginPage("/login");
        });

        http.authenticationProvider(provider);

        http.authorizeHttpRequests(request -> {
            request.requestMatchers("/css/**", "/js/**", "/login").permitAll();

            request.anyRequest().authenticated();
        });

        return http.build();
    }
}
