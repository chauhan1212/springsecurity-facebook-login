package com.vijay.springsecurityfacebooklogin;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
        .csrf().disable()
        .authorizeRequests().antMatchers("/authenticate").permitAll()
        .anyRequest().authenticated()
        .and()
        .oauth2Login();
    }
}