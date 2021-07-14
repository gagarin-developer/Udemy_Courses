package zone.gagarin.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate.entity.Employee;

public class Test4 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
        .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      session.createQuery("update Employee set salary=1000 "
          + "where name='Peter'").executeUpdate();





      session.getTransaction().commit();
      System.out.println("Done!!!");


    } finally {
      factory.close();
    }
  }

}
