package zone.gagarin.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate_one_to_many_bi.entity.Department;
import zone.gagarin.hibernate_one_to_many_bi.entity.Employee;

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
//      Department department = new Department("Sales",800, 1500);
//      Employee emp1 = new Employee("Alexander", "Gagarin", 1500);
//      Employee emp2 = new Employee("Zaur", "Tregulov", 800);
//      Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//      department.addEmployeeToDepartment(emp1);
//      department.addEmployeeToDepartment(emp2);
//      department.addEmployeeToDepartment(emp3);
      session.beginTransaction();
      System.out.println("Get dep");
      Department department = session.get(Department.class,5);
      System.out.println("Show dep");
      System.out.println(department);

      System.out.println("Loading employees");
      department.getEmployees().get(0);



      session.getTransaction().commit();

      System.out.println("Show emps");
      System.out.println(department.getEmployees());

      System.out.println("Done!!!");


    } finally {
      session.close();
      factory.close();
    }
  }

}
