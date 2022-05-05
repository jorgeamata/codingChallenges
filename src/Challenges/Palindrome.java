package Challenges;

public class Palindrome {

	public static void main(String[] args) {
		String input = "Amore roma";
		input.toLowerCase();
		
		input = input.replace(" ", "");
		
		
		String reverseString = "";
		for(int i=input.length() -1; i>=0; i--) {
			reverseString = reverseString + input.charAt(i);
		}
		
		boolean isPalindrome = true;
		for(int i=0; i<input.length(); i++) {
			if(reverseString.charAt(i) != input.charAt(i)) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("Not a palindrome");
		}

	}
	
	
}
