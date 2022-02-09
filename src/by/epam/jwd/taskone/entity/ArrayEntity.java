package by.epam.jwd.taskone.entity;

import java.util.Arrays;

public class ArrayEntity {
	private int [] arr;
	
	public ArrayEntity() {		
	}

	public ArrayEntity(int[] arr) {
		super();
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arr);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayEntity other = (ArrayEntity) obj;
		return Arrays.equals(arr, other.arr);
	}

	@Override
	public String toString() {
		return "ArrayEntity [arr=" + Arrays.toString(arr) + "]";
	}
}
