// program to count the number of vowels and consonants in a given string.

import java.util.Scanner;

public class CountVowelsConsonants{

// create a method for count number of vowels and consonants
public static void count(String str){
	str=str.toLowerCase();
	int vowels=0;
	int consonants=0;
for(int i=0; i<str.length(); i++){
if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
	vowels++;
else
	consonants++;
}
// print the result
System.out.println("vowels: " + vowels + "  consonants: " + consonants);
}

public static void main(String[] args){

// create scanner class object for taking input
Scanner sc=new Scanner(System.in);

// Take input from user
System.out.println("Enter a string");
String str=sc.next();

str=str.trim();


// call the method
count(str);
}
}