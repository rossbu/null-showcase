package com.showcase.nullability.jetbrains;

//import java.util.Collections;
public class Employee {

	private final String name;

	private final ThreadLocal<Integer> age = ThreadLocal.withInitial(() -> 0);

	private String address;

	public Employee() {
		this("", 0, "");
	}

	public Employee(String name, int age, String address) {
		this.name = name;
		this.age.set(age);
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age.get();
	}

	public String getAddress() {
		return address;
	}

}
