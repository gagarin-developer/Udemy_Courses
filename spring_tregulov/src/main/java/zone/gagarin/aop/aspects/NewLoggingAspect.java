package zone.gagarin.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

  @Around("execution(String returnBook())")
  public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("aroundReturnBookLoggingAdvice: They're trying to get the book back ");
    Object targetMethodResult = null;
    try{
      targetMethodResult = proceedingJoinPoint.proceed();
    }
    catch (Exception e){
      System.out.println("aroundReturnBookLoggingAdvice: EXCEPTION " + e);
      throw e;
   }

    System.out.println("aroundReturnBookLoggingAdvice: The book was returned successfully ");
    return targetMethodResult;
  }

}
