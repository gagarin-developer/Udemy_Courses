package zone.gagarin.hibernate_one_to_many_uni.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String departmentName;

  @Column(name = "min_salary")
  private int minSalary;

  @Column(name = "max_salary")
  private int maxSalary;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "department_id")
  private List<Employee> employees;


  public Department() {
  }

  public Department(String departmentName, int minSalary, int maxSalary) {
    this.departmentName = departmentName;
    this.minSalary = minSalary;
    this.maxSalary = maxSalary;
  }

  public void addEmployeeToDepartment(Employee employee){
    if(employees == null){
      employees = new ArrayList<>();
    }
    employees.add(employee);

  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public int getMinSalary() {
    return minSalary;
  }

  public void setMinSalary(int minSalary) {
    this.minSalary = minSalary;
  }

  public int getMaxSalary() {
    return maxSalary;
  }

  public void setMaxSalary(int maxSalary) {
    this.maxSalary = maxSalary;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Department{" +
        "id=" + id +
        ", departmentName='" + departmentName + '\'' +
        ", minSalary=" + minSalary +
        ", maxSalary=" + maxSalary +
        '}';
  }
}
