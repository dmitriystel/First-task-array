package View;

public class ArrayShow {
	public void printArray (String str, int[] array) {
		System.out.print(str);
		for (int a : array) {
			System.out.print(a + " ");						
		}		
		System.out.println();		
	}
	
	public void printValue (String str, int number) {
		System.out.println(str + number);
	}
}
