package com.patterns.state;

/**
 * TODO - Fill in description.
 */
public class FanHighState extends State {
	private Fan fan;

	public FanHighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan Off");
		fan.setState(fan.getFanOffState());
	}

	public String toString() {
		return "Fan is High";
	}
}
