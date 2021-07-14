package zone.gagarin.aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class University {
  private List<Student> students = new ArrayList<>();

  public void addStudent(){
    Student st1 = new Student("Alexander Gagarin", 5, 4.9);
    Student st2 = new Student("Elena Gagarina", 1, 5.0);
    Student st3 = new Student("Zaur Tregulov", 3, 4.5);

    students.add(st1);
    students.add(st2);
    students.add(st3);

  }


  public List<Student> getStudents() {
    System.out.println("Beginning work getStudents method");
//    System.out.println(students.get(33));
    System.out.println("Information from getStudents: ");
    System.out.println(students);
    return students;
  }
}
