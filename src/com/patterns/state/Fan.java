package com.patterns.state;

/**
 * TODO - Fill in description.
 */
public class Fan {

	State fanOffState;
	State fanLowState;
	State fanMedState;
	State fanHighState;
	State state;

	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		fanHighState = new FanHighState(this);
		this.state = fanOffState;
	}

	public void pullChain() {
		state.handleRequest();
		System.out.println(state.toString());
	}

	public String toString() {
		return state.toString();
	}

	public State getFanHighState() {
		return this.fanHighState;
	}

	public State getFanMedState() {
		return this.fanMedState;
	}

	public State getFanLowState() {
		return this.fanLowState;
	}

	public State getFanOffState() {
		return this.fanOffState;
	}

	public void setState(final State state) {
		this.state = state;
	}
}
