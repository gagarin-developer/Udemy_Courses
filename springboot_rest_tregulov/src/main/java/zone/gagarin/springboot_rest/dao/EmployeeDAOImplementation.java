package zone.gagarin.springboot_rest.dao;

import java.util.List;
import javax.persistence.EntityManager;
//import org.hibernate.Query;
//import org.hibernate.Session;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zone.gagarin.springboot_rest.entity.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

  @Autowired
  private EntityManager entityManager;

  @Override
  public List<Employee> getAllEmployees() {
//    Session session = entityManager.unwrap(Session.class);
//    Query<Employee> query = session.createQuery("from Employee", Employee.class);
//    List<Employee> allEmployees = query.getResultList();

    Query query = entityManager.createQuery("from Employee");
    List<Employee> allEmployees = query.getResultList();
    return allEmployees;
  }

  @Override
  public void saveEmployee(Employee employee) {
//    Session session = entityManager.unwrap(Session.class);
//    session.saveOrUpdate(employee);

    Employee newEmployee = entityManager.merge(employee);
    employee.setId(newEmployee.getId());

  }

  @Override
  public Employee getEmployee(int id) {
//    Session session = entityManager.unwrap(Session.class);
//    Employee employee = session.get(Employee.class,id);

    Employee employee = entityManager.find(Employee.class,id);
    return employee;
  }

  @Override
  public void deleteEmployee(int id) {
//    Employee employee = sessionFactory.getCurrentSession().get(Employee.class,id);
//    sessionFactory.getCurrentSession().delete(employee);

//    Session session = entityManager.unwrap(Session.class);
//    Query<Employee> query = session.createQuery("delete from Employee "
//        + "where id=:employeeId");
//    query.setParameter("employeeId",id);
//    query.executeUpdate();

    Query query = entityManager.createQuery("delete from Employee "
        + "where id=:employeeId");
    query.setParameter("employeeId",id);
    query.executeUpdate();

  }
}
