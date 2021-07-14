package zone.gagarin.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate_one_to_many_uni.entity.*;

public class Test1 {
  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Department.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();
//      Department department = new Department("HR",500, 1400);
//      Employee emp1 = new Employee("Oleg", "Ivanov", 800);
//      Employee emp2 = new Employee("Elena", "Smirnova", 1200);
//      department.addEmployeeToDepartment(emp1);
//      department.addEmployeeToDepartment(emp2);
      session.beginTransaction();

      Department department = session.get(Department.class,4);
      session.delete(department);



      session.getTransaction().commit();
      System.out.println("Done!!!");


    } finally {
      session.close();
      factory.close();
    }
  }

}
