package collectionPreperation;

import java.util.Objects;

public class Student {
	private String name;
	private int rollNumber;
	private String gender;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int rollNumber, String gender, int age) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", gender=" + gender + ", age=" + age + "]";
	}

}
