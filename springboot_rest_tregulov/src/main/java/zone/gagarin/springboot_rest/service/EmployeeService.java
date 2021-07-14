package zone.gagarin.springboot_rest.service;

import java.util.List;
import zone.gagarin.springboot_rest.entity.Employee;

public interface EmployeeService {

  List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);


}
