package zone.gagarin.springboot_data_jpa.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import zone.gagarin.springboot_data_jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
  List<Employee> findAllByName(String name);

}
