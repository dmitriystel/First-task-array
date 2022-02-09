package by.epam.jwd.taskone.service.impl;

import by.epam.jwd.taskone.service.IGetValueOrSortedArray;

public class GetValueOrSortedArrayImpl implements IGetValueOrSortedArray{

	@Override
	public int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}		
		}		
		return min;
	}

	@Override
	public int findMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	@Override
	public int findSum(int[] array) {
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}

	@Override
	public int findAverage(int[] array) {
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum/array.length;
	}

	@Override
	public int numberPositiveElements(int[] array) {
		int result = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				result++;
			}
		}
		return result;
	}

	@Override
	public int numberNegativeElements(int[] array) {
		int result = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				result++;
			}
		}
		return result;	
	}

	@Override
	public void bubbleSort(int[] array) {
		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
		
	@Override
	public void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && current < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}
	}
		
	@Override
	public void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = min;
			array[minIndex] = temp;
		}
	} 
			
	@Override
	public void replaceNegativeElementsWithMinusOne(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < -1) {
				array[i] = -1;
			}			
		}		
	}

	@Override
	public void replacingNumbersGreaterThanTenWithTen(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10) {
				array[i] = 10;
			}			
		}
		
	}
}
