package com.hialan.patterns.command;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/15/15 10:14
 */
public class ConcreteCommand extends Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.doSomething();
	}
}
