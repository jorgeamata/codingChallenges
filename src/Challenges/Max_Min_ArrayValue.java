package Challenges;

import java.util.Arrays;

public class Max_Min_ArrayValue {

	public static void main(String[] args) {
		
		int[] array = {-1, 3, 45, 6, 9, -90, 189};
		
		Arrays.sort(array);
		int size = array.length;
		
		System.out.println("Min value of the array is " + array[0]);
		System.out.println("Max value of the array is " + array[size - 1]);

	}

}
