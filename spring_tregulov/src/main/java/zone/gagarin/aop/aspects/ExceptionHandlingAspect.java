package zone.gagarin.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
  @Before("zone.gagarin.aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddExceptionHandlingAdvise(){
    System.out.println("beforeAddExceptionHandlingAdvise: catching and throwing exception");
    System.out.println("----------------------------------------------------");
  }


}
