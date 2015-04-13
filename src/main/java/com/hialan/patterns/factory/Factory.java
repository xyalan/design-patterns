package com.hialan.patterns.factory;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 13:20
 */
public class Factory implements IFactory {
	public IAuto produceAuto() {
		return new Car();
	}
}
