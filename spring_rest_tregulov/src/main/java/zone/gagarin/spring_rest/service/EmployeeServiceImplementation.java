package zone.gagarin.spring_rest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zone.gagarin.spring_rest.dao.EmployeeDAO;
import zone.gagarin.spring_rest.entity.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

  @Autowired
  private EmployeeDAO employeeDAO;

  @Override
  @Transactional
  public List<Employee> getAllEmployees() {
    return employeeDAO.getAllEmployees();
  }

  @Override
  @Transactional
  public void saveEmployee(Employee employee) {
    employeeDAO.saveEmployee(employee);
  }

  @Override
  @Transactional
  public Employee getEmployee(int id) {
    return employeeDAO.getEmployee(id);
  }

  @Override
  @Transactional
  public void deleteEmployee(int id) {
    employeeDAO.deleteEmployee(id);
  }

}
