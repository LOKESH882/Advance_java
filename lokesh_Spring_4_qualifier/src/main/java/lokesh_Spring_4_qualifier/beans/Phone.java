package lokesh_Spring_4_qualifier.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lokesh_Spring_4_qualifier.utility.SimOperation;

@Component
public class Phone {
	private int id;
	private String Name;
	
	@Autowired
	@Qualifier(value="jio")
	private SimOperation simOperation_jio;
	@Autowired
	@Qualifier(value="idea")
	private SimOperation simOperation_idea;
	public Phone() {
		super();
		
	}
	
	public Phone(String name) {
		super();
		Name = name;
	}
	
	@Autowired
	public Phone(@Value(value="1") int id, @Value(value="IPhone") String name) {
		super();
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	

	public SimOperation getSimOperation_jio() {
		return simOperation_jio;
	}

	public void setSimOperation_jio(SimOperation simOperation_jio) {
		this.simOperation_jio = simOperation_jio;
	}

	public SimOperation getSimOperation_idea() {
		return simOperation_idea;
	}

	public void setSimOperation_idea(SimOperation simOperation_idea) {
		this.simOperation_idea = simOperation_idea;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", Name=" + Name + "]";
	}
	
	
}
