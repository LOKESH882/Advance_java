package lokesh_Spring_1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lokesh_Spring_1.entity.Employee;
import lokesh_Spring_1.entity.Nation;
//Spring IOC
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println(emp1);

		/*
		 * Employee emp2=context.getBean("emp",Employee.class);
		 * System.out.println(emp2);
		 */
		 Nation nation=context.getBean("country", Nation.class);
		 System.out.println(nation);
	}

}
