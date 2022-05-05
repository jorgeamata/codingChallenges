package Challenges;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String input = "Madam Arora teaches Malayalam";
		
		
		
	}
	
	public static boolean isPalindrome(String word) {
		
		int n = word.length();
		word.toLowerCase();
		
		for(int i=0; i < n; i++, n--) {
			if(word.charAt(i) != word.charAt(n)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static String longestPalindrome(String word) {
		return "";
	}
	
	

}
