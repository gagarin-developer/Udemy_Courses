package zone.gagarin.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary{
  public void getBook(){
    System.out.println("We take the book from University ");
    System.out.println("----------------------------------------------------");
  }

  public void getMagazine(){
    System.out.println("We take the magazine from University");
    System.out.println("----------------------------------------------------");

  }

  public String returnBook(){
    int number = 10/0;
    System.out.println("We return the book to University");
    return "War and Peace";
  }

  public void returnMagazine(){
    System.out.println("We return the magazine to University");
    System.out.println("----------------------------------------------------");

  }

  public void addBook(String person_name, Book book){
    System.out.println("We add the book to University");
    System.out.println("----------------------------------------------------");

  }

  public void addMagazine(){
    System.out.println("We add the magazine to University");
    System.out.println("----------------------------------------------------");

  }

}
