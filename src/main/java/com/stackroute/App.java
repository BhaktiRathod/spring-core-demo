package com.stackroute;

<<<<<<< HEAD
import com.stackroute.config.ConfigurationClass;
import com.stackroute.domain.Employee;
import com.stackroute.domain.EmployeeRecord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
=======
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
>>>>>>> aa5ad755749638ce6f2ee15ff5477da9f5fda53b
 *
 */
public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD

        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Employee employee = (Employee) context.getBean("getEmployee");
        employee.setEmpName("John");
        employee.setEmpId(123);
        EmployeeRecord employeeRecord = employee.getEmployeeRecord();
//        employeeRecord.setProjectName("java");
//        employeeRecord.setProjectId(12);

        System.out.println(employee);
=======
        System.out.println( "Hello World!" );

        //Spring IOC Container
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");

        Employee emp = (Employee) context.getBean("empbean1");

        System.out.println(emp);

        Employee emp1 = (Employee) context.getBean("empbean3");

        System.out.println(emp1);


>>>>>>> aa5ad755749638ce6f2ee15ff5477da9f5fda53b
    }
}
