package com.yash.secondHighestNoDemo;

public class Student {
	private  String name;
	private  int id;

	private  Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {

		Student student = new Student("monali", 101);
		Student student1 = new Student("sonali", 102);
		System.out.println(student);
		System.out.println(student1);
		student.name="priya";
		System.out.println(student);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + id + " ";
	}

}
