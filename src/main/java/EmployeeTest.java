
import com.autum_project.Employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
    public void Instantiate() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        try {
            Employee emp = (Employee) ctx.getBean("emp");
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
        } catch (Exception e) {
            System.out.println("Instantiation failed");
        }
        ctx.close();
    }

}
