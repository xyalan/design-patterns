package com.hialan.patterns.builder;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/13/15 12:55
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Memo mo1 = director.getOrderMemo();
		mo1.showMemo();

		Memo mo2 = director.getSellerMemo();
		mo2.showMemo();
	}
}
