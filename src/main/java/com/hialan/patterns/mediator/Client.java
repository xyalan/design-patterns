package com.hialan.patterns.mediator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:38
 */
public class Client {
	public static void main(String[] args) {
		AbstractColleague abstractColleagueA = new ColleagueA();
		AbstractColleague abstractColleagueB = new ColleagueB();

		AbstractMediator abstractMediator = new Mediator(abstractColleagueA, abstractColleagueB);
		System.out.println("==========set abstractColleagueA effect on abstractColleagueB==========");
		abstractColleagueA.setNumber(1000, abstractMediator);
		System.out.println("number of abstractColleagueA is:"+abstractColleagueA.getNumber());
		System.out.println("abstractColleagueB is 10 times abstractColleagueA: " +
				""+abstractColleagueB.getNumber());

		System.out.println("==========set abstractColleagueB effect on abstractColleagueA==========");
		abstractColleagueB.setNumber(1000, abstractMediator);
		System.out.println("number of abstractColleagueB is:"+abstractColleagueB.getNumber());
		System.out.println("abstractColleagueA is 0.1 times " +
				"abstractColleagueB:"+abstractColleagueA.getNumber());
	}
}
