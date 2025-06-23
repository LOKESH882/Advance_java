package lokesh_Spring_1.entity;

public class Employee {
	private int id;
	private String name;
	private Nation nation;
	
	public Employee() {
		
		
	} 
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee(int id, String name) {
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

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", nation=" + nation + "]";
	}

	
	
	
}
