package zone.gagarin.spring_rest.dao;

import java.util.List;
import zone.gagarin.spring_rest.entity.Employee;

public interface EmployeeDAO {

  List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);
}
