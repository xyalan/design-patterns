package com.hialan.patterns.factory;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 13:20
 */
public class Car implements IAuto {
	private Engine engine;

	private Wheel wheel;

	private Tyre tyre;

	public Car(Engine engine, Wheel wheel, Tyre tyre) {
		this.engine = engine;
		this.wheel = wheel;
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("drive car");
	}
}
