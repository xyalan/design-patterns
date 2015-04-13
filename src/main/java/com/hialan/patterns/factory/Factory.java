package com.hialan.patterns.factory;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 13:20
 */
public class Factory implements IFactory {
	public IAuto produceAuto() {
		Engine engine = new Engine();
		Wheel wheel = new Wheel();
		Tyre tyre = new Tyre();
		return new Car(engine, wheel, tyre);
	}
}
