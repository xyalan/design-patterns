package com.hialan.patterns.template_method;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/12/15 18:59
 */
public class ConcreteSort extends AbstractSort {
	@Override
	protected void sort(int[] array) {
		for(int i=0; i<array.length-1; i++){
			selectSort(array, i);
		}
	}

	private void selectSort(int[] array, int index) {
		int minValue = 32767; // maximum variable
		int indexMin = 0; // minimum index
		int temp; // temporary variable
		for (int i = index; i < array.length; i++) {
			if (array[i] < minValue){
				minValue = array[i];
				indexMin = i;
			}
		}
		temp = array[index]; // exchange value
		array[index] = array[indexMin];
		array[indexMin] = temp;
	}

}
