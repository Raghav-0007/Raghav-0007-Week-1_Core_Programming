// Find the Longest Word in a Sentence

import java.util.Scanner;

public class LongestWord{
	
	// method for remove duplicate character from string
	public static String longestWord(String sentence){
		String[] words= sentence.split(" ");
		
		String longest="";
		for(String word: words){
			if(word.length()>longest.length()){
				longest=word;
			}
		}
		return longest;
	};

public static void main(String[] args){

// create a Scanner class object for taking input
Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter sentence");
String sentence=sc.nextLine();

// print the result
String result=longestWord(sentence);
System.out.println("the Longest Word in Sentence is: " + result);
}
}