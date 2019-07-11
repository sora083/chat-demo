package com.sora.socket.web.chatdemo.config;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Configuration
//@EnableWebMvcSecurity
public class SecurityConfig {
//public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests().antMatchers("/singup").permitAll().anyRequest().authenticated();
//        http.formLogin().loginPage("/login").permitAll().and().logout().permitAll();
//
//        log.info("configured http: {}", http.toString());
//    }
//
//    @Configuration
//    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
//
//        @Override
//        public void init(AuthenticationManagerBuilder auth) throws Exception {
//
//            auth.inMemoryAuthentication().withUser("user1").password("password1").roles("USER");
//            auth.inMemoryAuthentication().withUser("user2").password("password2").roles("USER");
//            auth.inMemoryAuthentication().withUser("user3").password("password3").roles("USER");
//
//            log.info("auth: {}", auth.toString());
//        }
//    }
}
