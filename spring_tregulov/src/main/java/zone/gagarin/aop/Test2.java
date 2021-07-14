package zone.gagarin.aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    University university = context.getBean("university", University.class);
    university.addStudent();
    try {
      List<Student> studentList = university.getStudents();
      System.out.println(studentList);
    }
    catch (Exception e){
      System.out.println("Exception - " + e);
    }





    context.close();
  }



}
