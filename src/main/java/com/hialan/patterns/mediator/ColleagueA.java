package com.hialan.patterns.mediator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:36
 */
public class ColleagueA extends AbstractColleague {
	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.aAffectB();
	}
}
