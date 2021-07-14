package zone.gagarin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("zone.gagarin.spring")
public class MyConfig {

  @Bean
  public Pet catBean(){
    return new Cat();
  }

  @Bean
  public Person personBean(){
    return new Person(catBean());

  }

}
