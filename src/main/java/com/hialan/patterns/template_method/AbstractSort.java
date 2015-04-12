package com.hialan.patterns.template_method;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:58
 */
public abstract class AbstractSort {
	protected abstract void sort(int[] array);

	public void showSortResult(int[] array){
		this.sort(array);
		System.out.print("排序结果：");
		for (int i = 0; i < array.length; i++){
			System.out.printf("%3s", array[i]);
		}
	}
}
