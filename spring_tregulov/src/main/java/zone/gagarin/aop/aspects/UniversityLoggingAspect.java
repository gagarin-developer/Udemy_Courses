package zone.gagarin.aop.aspects;

import java.util.List;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import zone.gagarin.aop.Student;

@Component
@Aspect
public class UniversityLoggingAspect {

//  @Before("execution(* getStudents())")
//  public void beforeGetStudentsAdvice(){
//    System.out.println("beforeGetStudentsAdvice: Logging before getStudent method");
//  }
//
//  @AfterReturning(pointcut = "execution(* getStudents())",returning = "students")
//  public void afterGetStudentsAdvice(List<Student> students){
//    Student firstStudent = students.get(0);
//    String nameAndSurname = firstStudent.getNameAndSurname();
//    nameAndSurname = "Czar " + nameAndSurname;
//    firstStudent.setNameAndSurname(nameAndSurname);
//
//    double avgGrade = firstStudent.getAvgGrade();
//    avgGrade = avgGrade + 1;
//    firstStudent.setAvgGrade(avgGrade);
//    System.out.println("afterGetStudentsAdvice: Logging after getStudent method");
//  }


//  @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//  public void afterTrowingGetStudentsAdvice(Throwable exception){
//
//
//    System.out.println("afterTrowingGetStudentsAdvice: Logging exception => " + exception);
//  }
//  "execution(* getStudents())",returning = "students")

  @After("execution(* getStudents())")
  public void afterGetStudentsLoggingAdvice(){
    System.out.println("afterGetStudentsLoggingAdvice: Logging after getStudents");
  }

}
