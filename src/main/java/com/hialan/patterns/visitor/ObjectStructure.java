package com.hialan.patterns.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 10:05
 */
public class ObjectStructure {
	public static List<Element> getList() {
		List<Element> list = new ArrayList<Element>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int a = random.nextInt(100);
			if (a > 50) {
				list.add(new ConcreteElementA());
			} else {
				list.add(new ConcreteElementB());
			}
		}
		return list;
	}
 }
