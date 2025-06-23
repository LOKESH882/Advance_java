package lokesh_Spring_3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "employee")
@Scope(value="prototype")
public class Employee {
	
	// @Value("101")
	private int id;
	// @Value("Lokesh")
	private String name;
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	// @Autowired
	public Employee(@Value(value="101") int id, @Value(value="Lokesh")String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	@Autowired
	public void setId(@Value(value="101")int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Autowired
	public void setName(@Value(value="Lokesh")String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
