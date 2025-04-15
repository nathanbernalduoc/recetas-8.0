package com.grupo10.sumativa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.grupo10.sumativa2.jwt.Constants;
import com.grupo10.sumativa2.jwt.JWTAuthorizationFIlter;

@Configuration
@EnableWebSecurity(debug = true)
public class WebSecutiryConfig {

    @Autowired
    // JWTAuthorizationFIlter jwtAuthorizationFilter;
   private CustomAuthenticationProvider authProvider;

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
            http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.authenticationProvider(authProvider);
        return authenticationManagerBuilder.build();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/", "/home").permitAll()
                .requestMatchers("/**.css").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin((form) -> form
                .loginPage("/login")
                .permitAll()
            )
            .logout((logout) -> logout.permitAll());

        return http.build();
    } 

    // @Bean
    // public SecurityFilterChain configure(HttpSecurity http) throws Exception {
    //     http
    //         .csrf( (csrf) -> csrf.disable())
    //         // solo ruta Login es pública
    //         .authorizeHttpRequests( authz -> authz
    //         .requestMatchers(HttpMethod.POST, Constants.LOGIN_URL).permitAll()
    //         .requestMatchers(HttpMethod.GET, "/prueba").permitAll()
    //             .anyRequest().authenticated())
    //         .addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);

    //     return http.build();

    // } 

}
