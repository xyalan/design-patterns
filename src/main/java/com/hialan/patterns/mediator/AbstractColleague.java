package com.hialan.patterns.mediator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:29
 */
public abstract class AbstractColleague {
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract void setNumber(int number, AbstractMediator am);
}
