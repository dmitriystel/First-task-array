package by.epam.jwd.taskone.reader;

import java.util.List;

import by.epam.jwd.taskone.exception.ReaderException;

public interface IReader {
    List<String> readArray (String path) throws ReaderException;		 
}


