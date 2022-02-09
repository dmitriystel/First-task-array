package by.epam.jwd.taskone.service;

public interface IGetValueOrSortedArray {
	int findMin(int[] array);
	int findMax(int[] array);
	int findSum(int[] array);
	int findAverage(int[] array);
	int numberPositiveElements(int[] array);
	int numberNegativeElements(int[] array);
	void bubbleSort(int[] array);
	void insertionSort(int[] array);
	void selectionSort(int[] array);
	void replaceNegativeElementsWithMinusOne(int[] array);
	void replacingNumbersGreaterThanTenWithTen(int[] array);
}
