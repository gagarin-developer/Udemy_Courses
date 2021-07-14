package zone.gagarin.springboot_rest.dao;

import java.util.List;
import zone.gagarin.springboot_rest.entity.Employee;

public interface EmployeeDAO {

  List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);
}
