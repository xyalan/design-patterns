package com.hialan.patterns.mediator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:30
 */
public abstract class AbstractMediator {
	protected AbstractColleague abstractColleagueA;

	protected AbstractColleague abstractColleagueB;

	public AbstractMediator(AbstractColleague abstractColleagueA, AbstractColleague abstractColleagueB) {
		this.abstractColleagueA = abstractColleagueA;
		this.abstractColleagueB = abstractColleagueB;
	}

	abstract void aAffectB();

	abstract void bAffectA();
}
