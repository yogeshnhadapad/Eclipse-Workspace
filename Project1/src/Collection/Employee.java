package Collection;

public class Employee {
	public String name;
	public int id;
	public String city;
	public Employee(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	

}
