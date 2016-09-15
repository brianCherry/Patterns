package com.patterns.command;

/**
 * // Concrete Command
 */
public class ToggleCommand implements Command {
	private Light light;

	public ToggleCommand(final Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}
}
