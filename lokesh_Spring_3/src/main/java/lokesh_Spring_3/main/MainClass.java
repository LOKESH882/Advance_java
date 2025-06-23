package lokesh_Spring_3.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lokesh_Spring_3.bean.Employee;
import lokesh_Spring_3.bean.Nation;
import lokesh_Spring_3.config.Spring_Config;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Config.class);
		System.out.println("Hello Student");
		Employee emp1=context.getBean(Employee.class);
		System.out.println(emp1);
		
		Nation nation1=context.getBean(Nation.class);
		System.out.println(nation1);
		
		/*
		 * Nation nation2=context.getBean("country",Nation.class);
		 * System.out.println(nation2);
		 * 
		 * Employee emp2=context.getBean("employee",Employee.class);
		 * System.out.println(emp2);
		 */
		
		
	}

}
