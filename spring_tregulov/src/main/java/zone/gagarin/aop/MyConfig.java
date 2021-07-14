package zone.gagarin.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("zone.gagarin.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
