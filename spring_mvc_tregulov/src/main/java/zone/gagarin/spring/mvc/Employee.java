package zone.gagarin.spring.mvc;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import zone.gagarin.spring.mvc.validation.CheckEmail;

public class Employee {

  @Size(min = 2, message = " Name must be minimum 1 symbols")
  private String name;

  @NotBlank(message = "Surname is required field")
  private String surname;

  @Min(value = 5000, message = "must be greater than 4999")
  @Max(value = 20000, message = "must be less than 20001")
  private int salary;
  private String department;

  @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
  private String phoneNumber;

  @NotNull(message = "Car not selected")
  private String carBrand;
  //  private String[] languages;
  private String languages;
  private Map<String, String> departments;
  private Map<String, String> carBrands;
  private Map<String, String> languageList;

  @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
  private String email;

  public Employee() {
//    departments = new HashMap<>();
//    departments.put("IT", "Information Technology");
//    departments.put("HR", "Human Resources");
//    departments.put("Sales", "Sales");
    carBrands = new HashMap<>();
    carBrands.put("MERCEDES-BENZ", "MB");
    carBrands.put("TESLA", "TESLA");
    carBrands.put("BMW", "BMW");
    languageList = new HashMap<>();
    languageList.put("English", "EN");
    languageList.put("Deutsch", "DE");
    languageList.put("Russian", "RU");
    languageList.put("French", "FR");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public Map<String, String> getDepartments() {
    return departments;
  }

  public void setDepartments(Map<String, String> departments) {
    this.departments = departments;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //  public String[] getLanguages() {
//    return languages;
//  }
//
//  public void setLanguages(String[] languages) {
//    this.languages = languages;
//  }

  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public Map<String, String> getCarBrands() {
    return carBrands;
  }

  public void setCarBrands(Map<String, String> carBrands) {
    this.carBrands = carBrands;
  }

  public Map<String, String> getLanguageList() {
    return languageList;
  }

  public void setLanguageList(Map<String, String> languageList) {
    this.languageList = languageList;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", salary=" + salary +
        ", department='" + department + '\'' +
        '}';
  }
}
