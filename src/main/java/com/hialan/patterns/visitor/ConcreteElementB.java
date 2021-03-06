package com.hialan.patterns.visitor;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 10:02
 */
public class ConcreteElementB extends Element {
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("This is B");
	}
}
