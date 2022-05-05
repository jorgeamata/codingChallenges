package Challenges;

public class ExtractDigitFromString {

	public static void main(String[] args) {
		
		String sentence = "This 12 oranges are now 78";
		
		String digits = "";
		
		digits = sentence.replaceAll("[^0-9]", ""); //replace all that are not ^0-9 with empty ""
		
		System.out.println("Extracted values are: " + digits); // 1278
		
		int stringToIntValue = (Integer.valueOf(digits)); //convert string to int for 1278
		
		double operation =  (stringToIntValue / 10) + stringToIntValue;
		System.out.println(operation);
		
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
		
		String sentence2 = "This 1232 oranges are now 78";
		
		char[] array = sentence2.toCharArray();
		String sentenceWithNoDigits = "";
		for(int i=0; i<array.length; i++) {
			
			if(!Character.isDigit(array[i])) {
				sentenceWithNoDigits = sentenceWithNoDigits + array[i];
			}
		}
		
		System.out.println("Sentence with no digits: " + sentenceWithNoDigits);

	}

}
