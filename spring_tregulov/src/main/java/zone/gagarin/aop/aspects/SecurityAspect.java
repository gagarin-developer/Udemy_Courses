package zone.gagarin.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
  @Before("zone.gagarin.aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddSecurityAdvice(){
    System.out.println("beforeAddSecurityAdvice: Checking rights");
    System.out.println("----------------------------------------------------");
  }


}
