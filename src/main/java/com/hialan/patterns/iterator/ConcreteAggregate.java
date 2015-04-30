package com.hialan.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/30/15 23:00
 */
public class ConcreteAggregate implements Aggregate {
	private List list = new ArrayList();

	public void add(Object obj) {
		list.add(obj);
	}

	public void remove(Object obj) {
		list.remove(obj);
	}

	public Iterator iterator() {
		return new ConcreteIterator(list);
	}
}
