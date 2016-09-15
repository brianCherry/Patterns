package com.patterns.Mediator;

/**
 * TODO - Fill in description.
 */
public class TurnOnAllLightsCommand implements Command {

	private Mediator med;

	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOnAllLights();
	}
}
