package com.hialan.patterns.builder;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 12:48
 */
public class Memo {
	private String memo;

	private String type;

	public void setType(String type) {
		this.type = type;
	}

	public void setMemo(String name) {
		this.memo = name;
	}

	public void showMemo() {
		System.out.println("memo is " + memo);
		System.out.println("memo's type is " + type);
	}
}
