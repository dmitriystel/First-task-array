package by.epam.jwd.taskone.validator.impl;

import java.util.regex.Pattern;

import by.epam.jwd.taskone.validator.IStringValidator;

public class StringValidatorImpl implements IStringValidator {
   private static final String REGEX = "[-]?\\d(\\s?([-]?\\d))+";
 
	@Override
	public boolean validate(String line) {
        boolean pattern = Pattern.matches(REGEX, line);
        return pattern;
	}
}
