package by.epam.jwd.taskone.creator.impl;

import by.epam.jwd.taskone.creator.ICreatorArray;
import by.epam.jwd.taskone.entity.ArrayEntity;

public class CreatorArrayImpl implements ICreatorArray {

	@Override
	public ArrayEntity createArray(int[] array) {
		return new ArrayEntity(array);
	}
}
