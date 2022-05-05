package Challenges;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] array = {2, 4, 5, 6, 1, 9};
		
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
