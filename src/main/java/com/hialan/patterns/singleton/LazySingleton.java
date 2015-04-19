package com.hialan.patterns.singleton;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/19/15 23:04
 */
public class LazySingleton {
	private static LazySingleton singleton;

	private LazySingleton(){}

	public static synchronized LazySingleton getInstance(){
		if(singleton==null){
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
