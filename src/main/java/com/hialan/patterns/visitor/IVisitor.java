package com.hialan.patterns.visitor;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 09:58
 */
public interface IVisitor {
	void visit(ConcreteElementA eA);

	void visit(ConcreteElementB eB);
}
