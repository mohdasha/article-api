package com.bitwse.article.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
             http
//                     .authorizeRequests(a -> a.mvcMatchers(HttpMethod.GET, "/articles", "/articles/**").hasAuthority("READ")
                .oauth2ResourceServer().jwt();
    }
}
