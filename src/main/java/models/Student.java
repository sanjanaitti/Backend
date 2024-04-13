package models;

public class Student {
	int id;
	String name;
	String dept;
	Student(){}
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
	public String getDept() {
		return dept;
	}
	//setter Injection
	public void setDept(String dept) {
		this.dept = dept;
	}
	//constructor Injection
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

}
