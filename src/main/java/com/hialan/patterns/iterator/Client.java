package com.hialan.patterns.iterator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/30/15 23:02
 */
public class Client {
	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("1");
		ag.add("2");
		ag.add("3");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.printf(str);
		}
	}
}
