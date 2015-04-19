package com.hialan.patterns.singleton;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/19/15 23:08
 */
public class HolderSingleton {
	private HolderSingleton() {}

	public static class HolderSingletonHolder {
		private final static HolderSingleton instance = new HolderSingleton();
	}

	public static HolderSingleton getInstance() {
		return HolderSingletonHolder.instance;
	}
}
