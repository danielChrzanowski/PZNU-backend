package pznuBackend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        "/userByIdNoPassword",
                        "/user",
                        "/passwordById",
                        "/changePassword",
                        "/deleteUser",
                        "/getAllMojeZadania",
                        "/addMojeZadanie",
                        "/deleteLink",
                        "/getAllZadaniaNoId",
                        "/getZadanieById",
                        "/addPost").authenticated()
                .antMatchers("/", "/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        http.cors();
    }

}
