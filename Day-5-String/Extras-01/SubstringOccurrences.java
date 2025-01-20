// Find Substring Occurrences

import java.util.Scanner;

public class SubstringOccurrences{
	
	// method for find Occurrences of given sub string
	public static int subStrCount(String text, String subStr){
		int index=0;
		int count=0;
		
		while((index=text.indexOf(subStr, index))!=-1){
			count++;
			index+=subStr.length();
		}
		return count;
	};

public static void main(String[] args){

// create a Scanner class object for taking input
Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter text");
String text=sc.nextLine();
System.out.println("Enter sub string");
String subStr=sc.next();

// print the result
int result=subStrCount(text, subStr);
System.out.println("the Occurrences of sub string is: " + result);
}
}