package com.patterns.command;

import java.util.List;

/**
 * TODO - Fill in description.
 */
public class AllLightsCommand implements Command {
	private List<Light> lights;

	public AllLightsCommand(final List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light: lights) {
			light.toggle();
		}
	}
}
