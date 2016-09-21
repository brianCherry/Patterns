package com.patterns.observer;

/**
 * TODO - Fill in description.
 */
public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();

		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		tabletClient.addMessage("Messge 1");

		phoneClient.addMessage("Here is a new message!");
		phoneClient.addMessage("Here's another message.");
	}
}
