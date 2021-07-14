package zone.gagarin.rest.client;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zone.gagarin.rest.client.config.AppConfig;
import zone.gagarin.rest.client.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Communication communication = context.getBean("communication",Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employeeByID = communication.getEmployee(10);
//        System.out.println(employeeByID);

//        Employee employee = new Employee("Sveta", "Sokolova","HR",800);
//        employee.setId(14);
//        communication.saveEmployee(employee);


        communication.deleteEmployee(14);

    }
}
