package Challenges;

public class StringReverse {

	
	//Reverse a String
	
	public static void main(String[] args) {
		
		String r = reverse("This is a string");
		System.out.println(r);
		
	
	}
	
	public static String reverse(String s) {
		//Define the size of the array and assign values one by one 
		char[] array = new char[s.length()];
		
		int index = 0;
		
		//Iterate from last element to the first
		for(int i= s.length() - 1; i>=0; i--) {
			array[index] = s.charAt(i);//for first element, assign the last character
			index++;
		}
		
		//print the word as reverse
		String reverse = "";
		for(int i=0; i < s.length(); i++) {
			reverse = reverse + array[i];
		}
		
		return reverse;
		
	}

}
