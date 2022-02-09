package by.epam.jwd.taskone.reader.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.epam.jwd.taskone.exception.ReaderException;
import by.epam.jwd.taskone.reader.IReader;

public class ReaderImpl implements IReader {

	@Override
	public List<String> readArray(String path) throws ReaderException {
		List<String> strList = new ArrayList<>();
		
		BufferedReader in = null;		
		try {			
			in = new BufferedReader(new FileReader(path));
			String line;
			
			while((line = in.readLine()) != null) {
				strList.add(line);				
			}
			
		} catch (FileNotFoundException e) {
			throw new ReaderException("File "+ path + " not found");
		} catch (IOException e) {
            throw new ReaderException("I/O exception");
		}
		return strList;
	}
}

