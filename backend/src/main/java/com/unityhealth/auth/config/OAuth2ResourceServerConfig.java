package com.unityhealth.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

/**
 * Created by shanefox on 6/10/2016.
 */
@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("ithera-ng-backend");
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
            .antMatchers("/auth/**").permitAll()
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

}
