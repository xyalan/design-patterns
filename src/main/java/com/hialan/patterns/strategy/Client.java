package com.hialan.patterns.strategy;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/22/15 09:42
 */
public class Client {
	public static void main(String[] args) {
		Context context;
		System.out.println("======execute strategy a=====");
		context = new Context(new ConcreteStrategyA());
		context.execute();

		System.out.println("======execute strategy b=====");
		context = new Context(new ConcreteStrategyB());
		context.execute();
	}
}
