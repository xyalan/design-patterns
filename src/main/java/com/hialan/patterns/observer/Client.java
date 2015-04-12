package com.hialan.patterns.observer;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:23
 */
public class Client {
	public static void main(String[] args) {
		Subject subject  = new ConcreteSubject();
		subject.addObserver(new FirstConcreteObserver());
		subject.addObserver(new SecondConcreteObserver());
		subject.doSomething();
	}
}
