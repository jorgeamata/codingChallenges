package Challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedNumberInArray {

	public static void main(String[] args) {
	
		int[] array = {1,2,4,4,6,5,5,6,7,9,1,3,4,6};
		Arrays.sort(array);
		
		Map<Integer, Integer> elementCount = new HashMap<>();
		
		//Insert all elements from array into elementCount
		//If element is already present in elementCount, increment count by 1
		//If not present, put the element with value 1
		for(int arrayElement : array) {
			
			if(elementCount.containsKey(arrayElement)) {
				elementCount.put(arrayElement, elementCount.get(arrayElement + 1));
			} else {
				elementCount.put(arrayElement, 1);
			}
			
		}
		
		//Get most frequent element
		Set<Entry<Integer, Integer>> entrySet = elementCount.entrySet();
		
		
		

	}

}
