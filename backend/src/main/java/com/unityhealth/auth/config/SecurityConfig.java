package com.unityhealth.auth.config;

import com.unityhealth.auth.service.CustomPasswordEncoder;
import com.unityhealth.auth.service.CustomUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

/**
 * Created by shanefox on 7/10/2016.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private CustomUserDetailsService customUserDetailsService;
    private CustomPasswordEncoder customPasswordEncoder;

    @Autowired
    public SecurityConfig(CustomUserDetailsService customUserDetailsService,
                          CustomPasswordEncoder customPasswordEncoder) {
        this.customUserDetailsService = customUserDetailsService;
        this.customPasswordEncoder = customPasswordEncoder;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .httpBasic().disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .anonymous()
            .and()
            .authorizeRequests()
            .antMatchers("/oauth/**").permitAll()
            .antMatchers("/api/**").permitAll()
            .antMatchers("/test").authenticated()

            .antMatchers("/actuator").permitAll()
            .antMatchers("/autoconfig").permitAll()
            .antMatchers("/beans").permitAll()
            .antMatchers("/configprops").permitAll()
            .antMatchers("/dump").permitAll()
            .antMatchers("/env").permitAll()
            .antMatchers("/flyway").permitAll()
            .antMatchers("/health").permitAll()
            .antMatchers("/info").permitAll()
            .antMatchers("/liquibase").permitAll()
            .antMatchers("/metrics").permitAll()
            .antMatchers("/mappings").permitAll()
            .antMatchers("/shutdown").denyAll()
            .antMatchers("/trace").permitAll()
            .antMatchers("/docs").permitAll()
            .antMatchers("/heapdump").permitAll()
            .antMatchers("/jolokia").permitAll()
            .antMatchers("/logfile").permitAll()

            .anyRequest().permitAll()
            .and()
            .csrf().disable()
            .exceptionHandling()
            .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
            .and()
            .logout().logoutUrl("/logout").logoutSuccessUrl("/");
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.customUserDetailsService)
            .passwordEncoder(customPasswordEncoder);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return super.userDetailsServiceBean();
    }

}
