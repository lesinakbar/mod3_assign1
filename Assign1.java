/*
 * Program to find the sqaure root and cube root of a number using math class
 */
import java.lang.Math;

public class Assign1 {

	public static void main(String[] args) {
		
		int enteredNumber = 3;
		double ansCube;
		double ansSquare;
		
		System.out.println(" The number entered is : " + enteredNumber);
		
		ansSquare = Math.sqrt(enteredNumber);
		ansCube = Math.cbrt(enteredNumber);
		
		System.out.println("\nSquare root of the entered number is : " + ansSquare);
		System.out.println("Cube root of the entered number is : "+ ansCube);


	}

}
