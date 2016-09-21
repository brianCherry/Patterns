package com.patterns.java8test;

/**
 * TODO - Fill in description.
 */
public class Class1 {
	private String name;
	private String value;

	public Class1(String name, String value ) {
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
}
