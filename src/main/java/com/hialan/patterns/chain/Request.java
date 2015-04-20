package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:14
 */
public class Request {
	private Level level;

	public Request(Level level) {
		this.level = level;
	}

	public Level getLevel() {
		return level;
	}
}
