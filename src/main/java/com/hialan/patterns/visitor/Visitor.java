package com.hialan.patterns.visitor;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 10:04
 */
public class Visitor implements IVisitor {
	public void visit(ConcreteElementA eA) {
		eA.doSomething();
	}

	public void visit(ConcreteElementB eB) {
		eB.doSomething();
	}
}
