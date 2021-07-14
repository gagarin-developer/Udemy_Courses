package zone.gagarin.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

    UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
    Book book = context.getBean("book",Book.class);
    universityLibrary.getBook();
    universityLibrary.addBook("Alexander",book);
    universityLibrary.addMagazine();

//    universityLibrary.returnBook();

//    SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//    schoolLibrary.getBook();

    context.close();

  }

}
