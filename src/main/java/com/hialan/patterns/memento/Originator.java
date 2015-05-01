package com.hialan.patterns.memento;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 5/1/15 23:30
 */
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Memento createMemento(){
		return new Memento(this.state);
	}
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
	}
}
