package com.hialan.patterns.iterator;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/30/15 23:00
 */
public interface Aggregate {
	void add(Object obj);
	void remove(Object obj);
	Iterator iterator();
}
