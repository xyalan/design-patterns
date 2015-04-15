package com.hialan.patterns.command;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/15/15 10:12
 */
public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}
