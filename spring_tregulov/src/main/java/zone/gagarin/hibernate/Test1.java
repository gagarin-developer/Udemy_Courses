package zone.gagarin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate.entity.Employee;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(
        Employee.class)
        .buildSessionFactory();

    Session session = factory.getCurrentSession();
    try {
      Employee employee = new Employee("Ivan", "Ivanov", "HZ", 100);
      session.beginTransaction();
      session.save(employee);
      session.getTransaction().commit();
      System.out.println("Done!!!");
      System.out.println(employee);
    }
    finally {
      factory.close();
    }

  }

}
