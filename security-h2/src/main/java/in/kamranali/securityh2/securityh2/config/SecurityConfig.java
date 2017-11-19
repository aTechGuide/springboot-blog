package in.kamranali.securityh2.securityh2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by bornshrewd on 19/11/17
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                .authorizeRequests().antMatchers("/console/**").permitAll()
                .anyRequest().authenticated();

        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }
}