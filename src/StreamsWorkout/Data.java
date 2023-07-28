package StreamsWorkout;

public class Data {
	private String name;
	private int id;
	private int salary;
	private String gender;
	private char initial;
	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Data(String name, int id, int salary, String gender, char initial, String role) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
		this.initial = initial;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + ", initial="
				+ initial + ", role=" + role + "]";
	}
}
