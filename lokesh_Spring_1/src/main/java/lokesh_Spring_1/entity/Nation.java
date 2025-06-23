package lokesh_Spring_1.entity;

public class Nation {
	private int id;
	private String name;
	
public Nation() {
		
		
	} 
	
	public Nation(String name) {
		super();
		this.name = name;
	}
	
	public Nation(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nation [id=" + id + ", name=" + name + "]";
	}
	
	

}
