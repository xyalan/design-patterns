package com.hialan.patterns.memento.multi;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 5/3/15 22:32
 */
public class Caretaker {
	private Map<String, Memento> memMap = new HashMap<String, Memento>();
	public Memento getMemento(String index){
		return memMap.get(index);
	}

	public void setMemento(String index, Memento memento){
		this.memMap.put(index, memento);
	}
}
