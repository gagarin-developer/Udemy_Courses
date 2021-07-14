package zone.gagarin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

    Person person = context.getBean("personBean",Person.class);
    person.callYourPet();
    System.out.println(person.getSurname() + " / " + person.getAge()) ;


    context.close();
  }

}
