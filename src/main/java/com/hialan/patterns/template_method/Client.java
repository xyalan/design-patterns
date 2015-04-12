package com.hialan.patterns.template_method;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 19:00
 */
public class Client {
	public static void main(String[] args) {
		int[] array = {1, 34, 134, 3, 43, 9, 89, 2, 4, 8, 10, 20, 30, 11};
		AbstractSort sort = new ConcreteSort();
		sort.showSortResult(array);
		System.out.println("wei:" + String.valueOf(5 ^ 5));

		bitwiseOperators();
	}

	public static void bitwiseOperators() {
		int a = 60;	/* 60 = 0011 1100 */
		int b = 13;	/* 13 = 0000 1101 */
		int c = 0;

		c = a & b;       /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );

		c = a | b;       /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );

		c = a ^ b;       /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );

		c = ~a;          /*-61 = 1100 0011 */
		System.out.println("~a = " + c );

		c = a << 2;     /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );

		c = a >> 2;     /* 15 = 1111 */
		System.out.println("a >> 2  = " + c );

		c = a >>> 2;     /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );

		int e =12, f =20;
		System.out.println("e=" + e + " f=" + f+ " before bitwise operate ");
		e = e ^ f;
		f = f ^ e;
		e = e ^ f;
		System.out.println("e=" + e + " f=" + f+ " after exchange value ");
	}
}
