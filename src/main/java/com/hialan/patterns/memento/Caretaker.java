package com.hialan.patterns.memento;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 5/1/15 23:31
 */
public class Caretaker {
	private Memento memento;
	public Memento getMemento(){
		return memento;
	}
	public void setMemento(Memento memento){
		this.memento = memento;
	}
}
