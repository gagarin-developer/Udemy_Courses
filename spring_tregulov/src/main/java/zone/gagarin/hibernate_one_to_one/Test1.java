package zone.gagarin.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate_one_to_one.entity.Detail;
import zone.gagarin.hibernate_one_to_one.entity.Employee;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Detail.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();

//      Employee employee = new Employee("Oleg", "Smirnov", "Sales",2100);
//      Detail detail = new Detail("Moscow","69784669456","olejasmert@yandex.ru");
//      employee.setEmpDetail(detail);

      session.beginTransaction();
      Employee employee = session.get(Employee.class,2);
      session.delete(employee);


      session.getTransaction().commit();
      System.out.println("Done!!!");


    } finally {
      session.close();
      factory.close();
    }
  }

}