package Collection;

public class Employe {

	
	Integer id;
	String name;
	Integer age;
	Integer doj;
	Double salary;
	String gender;
	
	public Employe(Integer id, String name, Integer age, Double salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.doj = doj;
		this.salary = salary;
		this.gender=gender;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDoj() {
		return doj;
	}

	public void setDoj(Integer doj) {
		this.doj = doj;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
