package com.patterns.command;

/**
 * Receiver
 */
public class Light {

	private String name;
	public Light(String name ) {
		this.name = name;
	}
	private boolean isOn = false;

	public void toggle() {
		if(isOn) {
			off();
			this.isOn = false;
		} else {
			on();
			this.isOn = true;
		}
	}
	public  void on() {
		System.out.println(name + " Light switched on");
	}

	public void off() {
		System.out.println(name + " Light switched off");
	}
}
