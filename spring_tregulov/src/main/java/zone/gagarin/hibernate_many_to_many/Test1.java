package zone.gagarin.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zone.gagarin.hibernate_many_to_many.entity.Child;
import zone.gagarin.hibernate_many_to_many.entity.Section;
import zone.gagarin.hibernate_one_to_many_bi.entity.Department;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Child.class)
        .addAnnotatedClass(Section.class)
        .buildSessionFactory();

    Session session = null;

    try {
      session = factory.getCurrentSession();
//      Section section1 = new Section("Dance");
//      Child child1 = new Child("Elena",13);
//      Child child2 = new Child("Pavel",12);
//      Child child3 = new Child("Lyubov",14);
//      section1.addChildToSection(child1);
//      section1.addChildToSection(child2);
//      section1.addChildToSection(child3);
//*************************************************************
//      Section section1 = new Section("Volleyball");
//      Section section2 = new Section("Chess");
//      Section section3 = new Section("Math");
//      Child child1 = new Child("Elena",10);
//      child1.addSectionToChild(section1);
//      child1.addSectionToChild(section2);
//      child1.addSectionToChild(section3);
//*************************************************************


      session.beginTransaction();

//      Section section = session.get(Section.class,7);
//      session.delete(section);

      Child child = session.get(Child.class,5);
      session.delete(child);

      session.getTransaction().commit();
      System.out.println("Done!!!");
    } finally {
      session.close();
      factory.close();
    }


  }

}
