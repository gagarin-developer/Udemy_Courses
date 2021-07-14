package zone.gagarin.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import zone.gagarin.aop.Book;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

  @Before("zone.gagarin.aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("methodSignature = " + methodSignature);
    System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
    System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
    System.out.println("methodSignature.getName() = " + methodSignature.getName());

    if (methodSignature.getName().equals("addBook")) {
      Object[] arguments = joinPoint.getArgs();
      for (Object obj : arguments) {
        if (obj instanceof Book) {
          Book myBook = (Book) obj;
          System.out.println(
              "Information Book: name - " + myBook.getName() + ", author - " + myBook.getAuthor() + ",year - " + myBook
                  .getYearOfPublication());

        }
        else if(obj instanceof String){
          System.out.println("Book in library add " + obj);
        }

      }
    }

    System.out.println("beforeAddLoggingAdvice: Logging trying to get a book or magazine");
    System.out.println("----------------------------------------------------");
  }

//  @Pointcut("execution(* zone.gagarin.aop.UniversityLibrary.*(..))")
//  private void allFromUniversityLibrary(){}
//
//  @Pointcut("execution(public void zone.gagarin.aop.UniversityLibrary.returnMagazine())")
//  private void returnMagazineFromUniversityLibrary(){}
//
//  @Pointcut("allFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//  private void allMethodsExceptReturnMagazineFromUniversity(){}
//
//
//  @Before("allMethodsExceptReturnMagazineFromUniversity()")
//  public void beforeAllMethodsExceptReturnMagazineAdvice(){
//    System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #11");
//  }

//  @Pointcut("execution(* zone.gagarin.aop.UniversityLibrary.get*())")
//  private void allGetMethodsFromUniversityLibrary(){}
//
//  @Pointcut("execution(* zone.gagarin.aop.UniversityLibrary.return*())")
//  private void allReturnMethodsUniversityLibrary(){}
//
//  @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsUniversityLibrary()")
//  private void allGetAndReturnMethodsUniversityLibrary(){}
//
//  @Before("allGetMethodsFromUniversityLibrary()")
//  public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetLoggingAdvice: writing Log #1");
//  }
//
//  @Before("allReturnMethodsUniversityLibrary()")
//  public void beforeReturnLoggingAdvice(){
//    System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//  }
//
//  @Before("allGetAndReturnMethodsUniversityLibrary()")
//  public void beforeGetAndReturnLoggingAdvice(){
//    System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//  }

//  @AfterReturning("pointcut_reference()")
//  public void afterGetInfo(){
//    System.out.println("afterGetInfo: program completed");
//  }


}
