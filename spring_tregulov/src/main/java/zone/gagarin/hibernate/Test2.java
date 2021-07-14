package zone.gagarin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate.entity.Employee;

public class Test2 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
        .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();

      Employee employee = new Employee("Alexander", "Gagarin", "IT", 10000000);
      session.beginTransaction();
      session.save(employee);
//      session.getTransaction().commit();

      int myId = employee.getId();
//      session = factory.getCurrentSession();
//      session.beginTransaction();
      Employee empl = session.get(Employee.class,myId);
      session.getTransaction().commit();
      System.out.println(empl);
      System.out.println("Done!!!");


    } finally {
      factory.close();
    }
  }

}
