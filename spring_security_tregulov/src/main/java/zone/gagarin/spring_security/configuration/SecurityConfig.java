package zone.gagarin.spring_security.configuration;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  DataSource dataSource;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    auth.jdbcAuthentication().dataSource(dataSource);

//    UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//    auth.inMemoryAuthentication()
//        .withUser(userBuilder.username("alex")
//            .password("alex")
//            .roles("EMPLOYEE"))
//        .withUser(userBuilder.username("elena")
//            .password("elena")
//            .roles("HR"))
//        .withUser(userBuilder.username("max")
//            .password("max")
//            .roles("MANAGER","HR"));
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
        .antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
        .antMatchers("/hr_info").hasRole("HR")
        .antMatchers("/manager_info").hasRole("MANAGER")
        .and().formLogin().permitAll();
  }
}
