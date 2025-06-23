package lokesh_Spring_4_qualifier.utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "idea")
public class Idea implements SimOperation {
	private int id;
	private String Name;
	
	public Idea() {
		super();
		
	}
	public Idea(String name) {
		super();
		Name = name;
	}
	@Autowired
	public Idea(@Value(value="111") int id, @Value(value="Idea") String name) {
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
		return "Idea [id=" + id + ", Name=" + Name + "]";
	}

	public void calling() {
		System.out.println("Idea Is Calling...");
		
	}
	
	
}
