package com.hialan.patterns.strategy;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/22/15 09:41
 */
public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void execute() {
		strategy.doSomething();
	}
}
