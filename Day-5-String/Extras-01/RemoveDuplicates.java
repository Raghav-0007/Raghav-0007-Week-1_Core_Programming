// Remove Duplicates from a String

import java.util.Scanner;

public class RemoveDuplicates{
	
	// method for remove duplicate character from string
	public static String removeDuplicate(String str){
		String result="";
		str=str.toUpperCase();
		int[][] hash= new int[26][2];
		for(int i=0; i<26; i++){
			hash[i][0]=i;
		}
		for(int i=0; i<str.length(); i++){
			hash[str.charAt(i)-'A'][1]++;
			if(hash[str.charAt(i)-'A'][1]==1)
				result+=str.charAt(i);
		}	return result;
	}

public static void main(String[] args){

// create a Scanner class object for taking input
Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter string");
String str=sc.next();

// print the result
String result=removeDuplicate(str);
System.out.println("duplicate removed string is: " + result);
}
}