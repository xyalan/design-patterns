package com.hialan.patterns.memento;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 5/1/15 23:30
 */
public class Memento {
	private String state = "";
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
