package zone.gagarin.spring_security.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "zone.gagarin.spring_security")
@EnableWebMvc
public class Config {

  @Bean
  public ViewResolver viewResolver(){
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/view/");
    internalResourceViewResolver.setSuffix(".jsp");
    return internalResourceViewResolver;
  }

  @Bean
  public DataSource dataSource(){
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    try {
      dataSource.setDriverClass("org.hsqldb.jdbcDriver");
      dataSource.setJdbcUrl("jdbc:hsqldb:mem:users");
      dataSource.setUser("user");
      dataSource.setPassword("user");

    } catch (PropertyVetoException ex){
      ex.printStackTrace();
    }
    return dataSource;
  }

}
