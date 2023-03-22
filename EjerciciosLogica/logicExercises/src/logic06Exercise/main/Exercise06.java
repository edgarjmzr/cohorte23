package logic06Exercise.main;

import java.util.Scanner;

//Ask by console a word or sentence. 
//It must show on console the String read backwards.
public class Exercise06 {
	public static void reverseAString() {
		Scanner scannerToReceiveAWord = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a word or a sentence: ");

	    String stringToReverse = scannerToReceiveAWord.nextLine();  // Read user input
	    StringBuilder stringbuilder = new StringBuilder(stringToReverse);
	    String answer = stringbuilder.reverse().toString();
	    
	    System.out.println("Your reversed word or sentence is: " + answer);  // Output user input
	    
	}
	
	

	//public static String reverse();
	
}
