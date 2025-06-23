package lokesh_Spring_2.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import lokesh_Spring_2.entity.Employee;
import lokesh_Spring_2.entity.Nation;

@ComponentScan(basePackages = {"lokesh_Spring_2.entity"})
public class Spring_Config {
	
	/*
	 * @Bean
	 * 
	 * @Scope("prototype") public Employee getEmployeObj() { return new Employee();
	 * }
	 * 
	 * @Bean("nation") public Nation getNationObj() { return new Nation(); }
	 */
}
