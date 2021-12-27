package com.admin.spring_admin.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;

@RequiredArgsConstructor
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    private final SecurityAuthenticationFilter securityAuthenticationFilter;
//    private final SecurityAccessDeniedHandler securityAccessDeniedHandler;
//    private final SecurityAuthenticationEntryPoint securityAuthenticationEntryPoint;
//    private final SecurityUserDetailService securityUserDetailService;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(securityUserDetailService)
//                .passwordEncoder(passwordEncoder());
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/admin").permitAll()
                .antMatchers("/admin_login").permitAll()
                .antMatchers("/userMainPage").permitAll()
                .antMatchers("/**").permitAll();

        http.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .permitAll();

        http.logout()
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true);

        http.exceptionHandling()
                .accessDeniedPage("/denied");
    }

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
//    }

}
