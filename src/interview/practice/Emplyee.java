package interview.practice;

public class Emplyee {

	private int id;
	private String name;
	private int salary;
	private String location;

	public Emplyee(int id, String name, int salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
	}

}