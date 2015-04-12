package com.hialan.patterns.mediator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:34
 */
public class Mediator extends AbstractMediator {
	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	@Override
	void aAffectB() {
		int number = abstractColleagueA.getNumber();
		abstractColleagueB.setNumber(number * 100);
	}

	@Override
	void bAffectA() {
		int number = abstractColleagueB.getNumber();
		abstractColleagueA.setNumber(number/100);
	}
}
