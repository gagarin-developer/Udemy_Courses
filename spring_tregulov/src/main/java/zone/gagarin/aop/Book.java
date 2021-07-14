package zone.gagarin.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
  @Value("Spring Framework")
  private String name;

  @Value("Robert Martin")
  private String author;

  @Value("2020")
  private int yearOfPublication;

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getYearOfPublication() {
    return yearOfPublication;
  }
}
