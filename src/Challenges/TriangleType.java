package Challenges;

public class TriangleType {

	public static void main(String[] args) {
		//Equilateral - all sides are equal
		//Isosceles - any of its two sides are equal
		//Scalene - none of the sides are equal
		
		int x=9;
		int y=9;
		int z=9;
		
		
		//Check if equilateral
		if(x==y && y==z) {
			System.out.println("Its equilateral");
		} else {
			if(x==y || y==z || z==x) {
				System.out.println("Its isosceles");
			} else {
				System.out.println("Its Scalene");
			}
		}

	}

}
