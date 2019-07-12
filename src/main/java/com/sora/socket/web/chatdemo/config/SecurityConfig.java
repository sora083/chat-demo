package com.sora.socket.web.chatdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().defaultSuccessUrl("/chat", true);
        http.formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().permitAll();
    }

    @Configuration
    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

        /**
         * @param auth
         * @throws Exception
         * @see <a href=https://qiita.com/gifmr/items/f30452007f6c6bd6e09d>reference</a>
         */
        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {

            auth.inMemoryAuthentication().withUser("user1").password("{noop}password1").roles("USER");
            auth.inMemoryAuthentication().withUser("user2").password("{noop}password2").roles("USER");
            auth.inMemoryAuthentication().withUser("user3").password("{noop}password3").roles("USER");
        }
    }
}
