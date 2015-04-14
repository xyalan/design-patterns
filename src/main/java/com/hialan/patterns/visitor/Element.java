package com.hialan.patterns.visitor;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 09:57
 */
public abstract class Element {
	public abstract void accept(IVisitor visitor);

	public abstract void doSomething();
}
