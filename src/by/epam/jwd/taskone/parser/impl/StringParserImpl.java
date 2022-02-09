package by.epam.jwd.taskone.parser.impl;

import java.util.ArrayList;
import java.util.List;

import by.epam.jwd.taskone.parser.IStringParser;
import by.epam.jwd.taskone.validator.impl.StringValidatorImpl;

public class StringParserImpl implements IStringParser {
	private static final String REGEX = "\s";

    @Override
	public int[] strParser(List<String> str) {
		List<Integer> numList = new ArrayList<>();
		StringValidatorImpl strValidator = new StringValidatorImpl();
		for (int i = 0; i < str.size(); i++) {
			if (strValidator.validate(str.get(i))) {
				String[] strArray = str.get(i).split(REGEX);
				for (String element : strArray) {
					numList.add(Integer.parseInt(element));
				}				
			}
		}
		
		int[] intArr = new int [numList.size()]; 		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = numList.get(i);
		}
		return intArr;
	}
}
