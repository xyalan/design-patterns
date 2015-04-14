package com.hialan.patterns.visitor;

import java.util.List;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/14/15 10:08
 */
public class Client {
	public static void main(String[] args) {
		List<Element> list = ObjectStructure.getList();
		for (Element e : list) {
			e.accept(new Visitor());
		}
	}
}
