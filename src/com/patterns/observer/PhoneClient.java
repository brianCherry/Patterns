package com.patterns.observer;

/**
 * TODO - Fill in description.
 */
public class PhoneClient extends Observer{

	Subject subject;

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}

	@Override
	void update() {
		System.out.println("Phone Stream:" + subject.getState());
	}
}
