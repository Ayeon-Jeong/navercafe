package com.helloworld.project1.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    // http 보안을 구성
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/design", "/orders", "/login")
                .access("hasRole('ROLE_USER')")
                .antMatchers("/", "/**")
                .access("permitAll")
                .and()
                .httpBasic();
    }

    // 사용자 인증 정보를 구성하는 메서드
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//          in-memory 방식
//            auth.inMemoryAuthentication()
//                .withUser("user1")
//                .password("{noop}password1")
//                .authorities("ROLE_USER")
//                .and()
//                .withUser("user2")
//                .password("{noop}password2")
//                .authorities("ROLE_USER");

        // jdbc 방식
//            auth
//                .jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery(
//                        "select username, password, enabled from users " +
//                        "where username=?"
//                    ).authoritiesByUsernameQuery(
//                        "select username, authority from authorities " +
//                        "where username=?"
//                    ).passwordEncoder(new NoEncodingPasswordEncoder());

        // LDAP 방식
            auth
                    .ldapAuthentication()
                    .userSearchBase("ou=people")
                    .userSearchFilter("(uid={0})")
                    .groupSearchBase("ou=groups")
                    .groupSearchFilter("member={0}")
                    .passwordCompare();
    }


}
