package zone.gagarin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigClass {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//    Pet cat1 = context.getBean("catBean",Pet.class);
//    cat1.say();
//
//    Pet cat2 = context.getBean("catBean",Pet.class);
//    cat2.say();

    Person person1 = context.getBean("personBean",Person.class);
    person1.getPet().say();
    System.out.println(person1.getSurname());
    System.out.println(person1.getAge());

    context.close();



  }

}
