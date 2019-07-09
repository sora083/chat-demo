package com.sora.socket.web.chatdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/singup").permitAll().anyRequest().authenticated();
        http.formLogin().loginPage("/login").permitAll().and().logout().permitAll();
    }

    @Configuration
    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {

            auth.inMemoryAuthentication().withUser("user1").password("password1").roles("USER");
            auth.inMemoryAuthentication().withUser("user2").password("password2").roles("USER");
            auth.inMemoryAuthentication().withUser("user3").password("password3").roles("USER");
        }
    }
}
