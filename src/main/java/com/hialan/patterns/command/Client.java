package com.hialan.patterns.command;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/15/15 10:16
 */
public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		command.execute();

		//another way invoking
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}
}
