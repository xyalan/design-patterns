package com.hialan.patterns.memento.multi;

import java.util.Map;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 5/3/15 22:31
 */
public class Memento {
	private Map<String, Object> stateMap;

	public Memento(Map<String, Object> map){
		this.stateMap = map;
	}

	public Map<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
}
