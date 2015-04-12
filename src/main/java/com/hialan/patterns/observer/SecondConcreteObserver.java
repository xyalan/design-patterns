package com.hialan.patterns.observer;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:22
 */
public class SecondConcreteObserver implements Observer {
	public void update() {
		System.out.println("second observer receive message");
	}
}
