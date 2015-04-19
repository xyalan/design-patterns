package com.hialan.patterns.singleton;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/19/15 23:02
 */
public class StarveSingleton {
	private static StarveSingleton singleton = new StarveSingleton();

	private StarveSingleton(){}

	public static StarveSingleton getInstance(){
		return singleton;
	}
}
