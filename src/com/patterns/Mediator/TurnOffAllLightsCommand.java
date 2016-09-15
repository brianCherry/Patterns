package com.patterns.Mediator;

/**
 * TODO - Fill in description.
 */
public class TurnOffAllLightsCommand implements Command {

	private Mediator med;

	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOffAllLights();
	}
}
