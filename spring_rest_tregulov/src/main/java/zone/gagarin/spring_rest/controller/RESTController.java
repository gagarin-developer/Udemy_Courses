package zone.gagarin.spring_rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zone.gagarin.spring_rest.entity.Employee;
import zone.gagarin.spring_rest.exception_handling.NoSuchEmployeeException;
import zone.gagarin.spring_rest.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class RESTController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employees")
  public List<Employee> showAllEmployees() {
    return employeeService.getAllEmployees();
  }

  @GetMapping("/employees/{id}")
  public Employee getEmployee(@PathVariable int id) {
    Employee employee = employeeService.getEmployee(id);
    if (employee == null) {
      throw new NoSuchEmployeeException("There is no employee wish ID = " + id + " in Database");
    }
    return employee;
  }

  @PostMapping("/employees")
  public Employee addNewEmployee(@RequestBody Employee employee) {
    employeeService.saveEmployee(employee);
    return employee;
  }

  @PutMapping("/employees")
  public Employee updateEmployee(@RequestBody Employee employee) {
    employeeService.saveEmployee(employee);
    return employee;
  }

  @DeleteMapping("/employees/{id}")
  public String deleteEmployee(@PathVariable int id) {
    Employee employee = employeeService.getEmployee(id);
    if(employee == null){
      throw new NoSuchEmployeeException("There is no employee wish ID = " + id + " in Database");
    }
    employeeService.deleteEmployee(id);
    return "Employee with ID = " + id + " was deleted.";
  }


}
