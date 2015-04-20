package com.hialan.patterns.chain;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/20/15 14:11
 */
public class Level {
	private int level = 0;

	public Level(int level) {
		this.level = level;
	}

	public boolean above(Level level) {
		if (this.level >= level.level) {
			return true;
		}
		return false;
	}
}
