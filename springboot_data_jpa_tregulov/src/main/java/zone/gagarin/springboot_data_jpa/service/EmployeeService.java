package zone.gagarin.springboot_data_jpa.service;

import java.util.List;
import zone.gagarin.springboot_data_jpa.entity.Employee;

public interface EmployeeService {

  List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);

  List<Employee> findAllByName(String name);


}
