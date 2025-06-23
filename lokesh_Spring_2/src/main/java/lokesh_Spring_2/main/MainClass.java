package lokesh_Spring_2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lokesh_Spring_2.entity.Employee;
import lokesh_Spring_2.entity.Nation;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Config.class);
		System.out.println("Hello Student");
		Employee emp1=context.getBean(Employee.class);
		System.out.println(emp1);
		
		Nation nation=context.getBean(Nation.class);
		System.out.println(nation);

	}

}
