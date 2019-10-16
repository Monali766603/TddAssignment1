package com.yash.immutableWithoutFinal;

public class ImmutableStudentWithoutFinal {

	private int id;
	private String name;

	ImmutableStudentWithoutFinal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " ";
	}

}
