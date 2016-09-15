package com.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO - Fill in description.
 */
public class CommandDemo {
	public static void main(String args[]) {

		Light bedroomlight = new Light("Bedroom");
		Light kitchenlight = new Light("Kitchen");
		Light bathroomLight = new Light("Bathroom");

		Switch lightSwitch = new Switch();

		Command toggleCommand = new ToggleCommand(bedroomlight);

		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		// lightSwitch.storeAndExecute(toggleCommand);
		List<Light> lights = new ArrayList<Light>();
		lights.add(bedroomlight);
		lights.add(kitchenlight);
		lights.add(bathroomLight);

		Command allLightsCommand = new AllLightsCommand(lights);
		lightSwitch.storeAndExecute(allLightsCommand);
		lightSwitch.storeAndExecute(allLightsCommand);
		lightSwitch.storeAndExecute(allLightsCommand);




	}
}
