package com.hialan.patterns.observer;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:21
 */
public class FirstConcreteObserver implements Observer {
	public void update() {
		System.out.println("first observer receive message");
	}
}
