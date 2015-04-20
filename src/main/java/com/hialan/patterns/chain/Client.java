package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:20
 */
public class Client {
	public static void main(String[] args) {
		Handler handler = new ConcreteHandlerA();
		Handler handler1 = new ConcretehandlerB();
		Handler handler2 = new ConcreteHandlerC();

		handler.setNextHandler(handler1);
		handler.setNextHandler(handler2);

		Response response = handler.handleRequest(new Request(new Level(4)));
	}
}
