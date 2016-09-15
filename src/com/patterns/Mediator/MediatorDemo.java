package com.patterns.Mediator;

/**
 * TODO - Fill in description.
 */
public class MediatorDemo {
	public static void main(String args[]) {

		Mediator mediator = new Mediator();

		Light bedroomlight = new Light("Bedroom");
		Light kitchenlight = new Light("Kitchen");

		mediator.registerLight(bedroomlight);
		mediator.registerLight(kitchenlight);

		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		turnOnAllLightsCommand.execute();

		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		turnOffAllLightsCommand.execute();
	}
}
