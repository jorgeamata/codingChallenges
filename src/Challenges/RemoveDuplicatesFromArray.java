package Challenges;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 6, 1, 2, 3};
		String[] stringArray = {"Test", "test", "void", "test", "void", "exam"};
		
		removeIntDuplicates(intArray);
		removeStringDuplicates(stringArray);
		
		
		

	}
	
	public static void removeIntDuplicates(int[] array) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		//adding element to set
		for(int i=0; i<array.length; i++) {
			set.add(array[i]);
		}
		
		//print the elements
		System.out.print(set);
			
	}
	
	public static void removeStringDuplicates(String[] array) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		//adding element to set
		for(int i=0; i<array.length; i++) {
			set.add(array[i]);
		}
		
		//print the elements
		System.out.print(set);
	}
	


}
