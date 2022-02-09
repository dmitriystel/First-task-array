package by.epam.jwd.taskone.main;

import java.util.List;

import View.ArrayShow;
import by.epam.jwd.taskone.creator.impl.CreatorArrayImpl;
import by.epam.jwd.taskone.entity.ArrayEntity;
import by.epam.jwd.taskone.exception.ReaderException;
import by.epam.jwd.taskone.parser.impl.StringParserImpl;
import by.epam.jwd.taskone.reader.impl.ReaderImpl;
import by.epam.jwd.taskone.service.impl.GetValueOrSortedArrayImpl;

public class Runner {

	public static void main(String[] args) throws ReaderException {
		String path = "resource\\data.txt";
		ReaderImpl reader = new ReaderImpl();
		List<String> line = reader.readArray(path);
		StringParserImpl parser = new StringParserImpl();
		int [] arr = parser.strParser(line);
		CreatorArrayImpl creator = new CreatorArrayImpl();
	    ArrayEntity array = creator.createArray(arr);
	    GetValueOrSortedArrayImpl result = new GetValueOrSortedArrayImpl();
		ArrayShow view = new ArrayShow(); 
		
		view.printArray("Array: ", array.getArr());
		
        result.findMin(array.getArr());
        view.printValue("Min value: ", result.findMin(array.getArr()));
		
        result.findMax(array.getArr());
        view.printValue("Max value: ", result.findMax(array.getArr()));
        
        result.findSum(array.getArr());
        view.printValue("Sum: ", result.findSum(array.getArr()));
		
        result.findAverage(array.getArr());
        view.printValue("Average value: ", result.findAverage(array.getArr()));
		
        result.numberPositiveElements(array.getArr());
        view.printValue("Number of positive elements: ", 
        		result.numberPositiveElements(array.getArr()));
        
        result.numberNegativeElements(array.getArr());
        view.printValue("Number of negative elements: ", 
        		result.numberNegativeElements(array.getArr()));
				
        result.bubbleSort(array.getArr());
		view.printArray("Bubble sort:    ", array.getArr());
				
		result.selectionSort(array.getArr());
		view.printArray("Selection sort: ", array.getArr());
		
		result.insertionSort(array.getArr());
		view.printArray("Insertion sort: ", array.getArr());
		
		result.replaceNegativeElementsWithMinusOne(array.getArr());
		view.printArray("Replacing negative elements with -1: ", array.getArr());
		
		
		result.replacingNumbersGreaterThanTenWithTen(array.getArr());
		view.printArray("Replacing numbers > than 10 with 10: ",  array.getArr());
	}
}
/*
Output:

Array: -153 -2 25 25 28 24561 0 598 321 
Min value: -153
Max value: 24561
Sum: 25403
Average value: 2822
Number of positive elements: 6
Number of negative elements: 2
Bubble sort:    -153 -2 0 25 25 28 321 598 24561 
Selection sort: -153 -2 0 25 25 28 321 598 24561 
Insertion sort: -153 -2 0 25 25 28 321 598 24561 
Replacing negative elements with -1: -1 -1 0 25 25 28 321 598 24561 
Replacing numbers > than 10 with 10: -1 -1 0 10 10 10 10 10 10
*/