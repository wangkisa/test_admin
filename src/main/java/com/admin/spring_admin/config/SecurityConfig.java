package com.admin.spring_admin.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@RequiredArgsConstructor
////@Configuration
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
////    private final SecurityAuthenticationFilter securityAuthenticationFilter;
////    private final SecurityAccessDeniedHandler securityAccessDeniedHandler;
////    private final SecurityAuthenticationEntryPoint securityAuthenticationEntryPoint;
////    private final SecurityUserDetailService securityUserDetailService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //실제 인증을 진행할 Provider
////        auth.authenticationProvider(authenticationProvider(homeService));
////        auth.userDetailsService(securityUserDetailService)
////                .passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        //이미지,자바스크립트,css 디렉토리 보안 설정
//
////        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**");
//        web.ignoring().antMatchers("/admin/css/**", "/admin/js/**", "/admin/img/**", "/admin/bootstrap/**", "/admin/vendor/**", "/admin/lib/**", "/**", "/admin/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        //HTTP 관련 보안 설정 **가장 중요
//
////        http.cors();
////        http.csrf().disable();
////        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////        http.headers().frameOptions().disable();
////        http.formLogin().disable();
////        http.logout().disable();
//
//        http.authorizeRequests()
//                    .antMatchers("/admin").permitAll()
//                    .antMatchers("/admin/perform_login").permitAll()
//                    .antMatchers("/admin/main").permitAll()
//                    .antMatchers("/**").permitAll();
////                    .anyRequest().authenticated();
////                .and()
////                .formLogin()
////                    .loginPage("/admin")
////                    .loginProcessingUrl("/admin/perform_login")
////                    .defaultSuccessUrl("/admin/main");
////                    .permitAll();
//
////        http.logout()
////                .logoutSuccessUrl("/login")
////                .invalidateHttpSession(true);
//
////        http.exceptionHandling()
////                .accessDeniedPage("/denied");
//    }
//
////    @Override
////    public void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
////    }
//
//}
