package com.patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator
 */
public class Mediator {
	private List<Light> lights = new ArrayList<>();

	public void registerLight(Light light) {
		lights.add(light);
	}

	public void turnOnAllLights() {
		for(Light light : lights) {
			if(!light.isOn()) {
				light.toggle();
			}
		}
	}

	public void turnOffAllLights() {
		for (Light light : lights) {
			if(light.isOn()) {
				light.toggle();
			}
		}
	}
}
