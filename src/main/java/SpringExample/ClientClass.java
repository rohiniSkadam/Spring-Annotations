package SpringExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientClass {

    public static void main(String[] args) {
        Employee eRef=new Employee();
        eRef.setEid(101);
        eRef.setEname("Abc");
        eRef.setEaddress("xyz");
        System.out.println("SpringExample.Employee Details : \n"+eRef);

        Resource resource=new ClassPathResource("EmployeeDetails.xml");
        BeanFactory factory= new XmlBeanFactory(resource);

        Employee e1=factory.getBean("emp1",Employee.class);
        System.out.println("New SpringExample.Employee Details : \n"+e1);

        ApplicationContext ap=new ClassPathXmlApplicationContext("EmployeeDetails.xml");
        Employee e2=ap.getBean("emp2",Employee.class);
        System.out.println("New SpringExample.Employee Details : \n"+e2);

        ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)ap;
        ctx.close();
    }
}
