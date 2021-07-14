package zone.gagarin.spring_rest.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zone.gagarin.spring_rest.entity.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Employee> getAllEmployees() {
    return sessionFactory.getCurrentSession()
        .createQuery("from Employee", Employee.class)
        .getResultList();
  }

  @Override
  public void saveEmployee(Employee employee) {
    sessionFactory.getCurrentSession().saveOrUpdate(employee);
  }

  @Override
  public Employee getEmployee(int id) {
    return sessionFactory.getCurrentSession().get(Employee.class,id);
  }

  @Override
  public void deleteEmployee(int id) {
//    Employee employee = sessionFactory.getCurrentSession().get(Employee.class,id);
//    sessionFactory.getCurrentSession().delete(employee);
    Session session = sessionFactory.getCurrentSession();
    Query<Employee> query = session.createQuery("delete from Employee "
        + "where id=:employeeId");
    query.setParameter("employeeId",id);
    query.executeUpdate();
  }
}
