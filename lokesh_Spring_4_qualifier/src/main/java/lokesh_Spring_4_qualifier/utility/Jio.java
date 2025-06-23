package lokesh_Spring_4_qualifier.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "jio")
public class Jio implements SimOperation{
	private int id;
	private String Name;
	
	public Jio() {
		super();
		
	}
	
	public Jio(String name) {
		super();
		Name = name;
	}
	@Autowired
	public Jio(@Value(value="222") int id, @Value(value="Jio") String name) {
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

	@Override
	public String toString() {
		return "Jio [id=" + id + ", Name=" + Name + "]";
	}

	public void calling() {
		System.out.println("Jio Is Calling...");
		
	}
	
}
