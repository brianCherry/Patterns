package com.patterns.java8test;

/**
 * TODO - Fill in description.
 */
public class Class2 {
	private String name;
	private String value;

	public Class2(String name, String value ) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Class2: " + this.name + " " + this.value ;
	}
}
