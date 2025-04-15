package com.grupo10.sumativa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.grupo10.sumativa2.jwt.Constants;
import com.grupo10.sumativa2.jwt.JWTAuthorizationFIlter;

@EnableWebSecurity
@Configuration
public class WebSecutiryConfig {

    @Autowired
    JWTAuthorizationFIlter jwtAuthorizationFilter;

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .csrf( (csrf) -> csrf.disable())
            // solo ruta Login es pública
            .authorizeHttpRequests( authz -> authz
            .requestMatchers(HttpMethod.POST, Constants.LOGIN_URL).permitAll()
            .requestMatchers(HttpMethod.GET, "/prueba").permitAll()
                .anyRequest().authenticated())
            .addFilterAfter(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();

    } 

}
