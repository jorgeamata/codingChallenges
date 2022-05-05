package Challenges;

public class FindDuplicateCharacters {

	//Find duplicate characters in a String
	
	public static void main(String[] args) {
		
		String sentence = "How many duplicates are there?"; 
		char[] array = sentence.toCharArray();
		int count = 0;
		
		for(int i=0; i<sentence.length(); i++) {
			
			for(int j=i+1; j<sentence.length(); j++) {
				
				if(array[i] == array[j]) {
					System.out.println(array[j]);
					count++;
					break;
				}
			}
			
			
		}
		
	
	}
}
