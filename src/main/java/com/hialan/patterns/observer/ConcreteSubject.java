package com.hialan.patterns.observer;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:18
 */
public class ConcreteSubject extends Subject {
	@Override
	public void doSomething() {
		System.out.println("notify observer");
		this.notifyObserver();
	}
}
