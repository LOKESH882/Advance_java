package lokesh_Spring_3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "country")
@Scope(value="prototype")
public class Nation {
	
	// autowire using field
	// @Value("1")
	private int id;
	// @Value("INDIA")
	private String name;
	
	public Nation() {
		
	}
	
	public Nation(String name) {
		super();
		this.name = name;
	}
	// @Autowired
	
	// auto wire using constructor
	public Nation(@Value(value="1")int id, @Value(value="India")String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	// autowired using setter methods
	@Autowired
	public void setId(@Value(value="1")int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value(value="India")String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nation [id=" + id + ", name=" + name + "]";
	}
	
	
}
