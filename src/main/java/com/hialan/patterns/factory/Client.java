package com.hialan.patterns.factory;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 13:21
 */
public class Client {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		IAuto auto = factory.produceAuto();
		auto.drive();
	}
}
