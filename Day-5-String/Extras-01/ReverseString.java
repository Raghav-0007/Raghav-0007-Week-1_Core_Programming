// program to reverse a given string without using any built-in reverse functions.


import java.util.Scanner;

public class ReverseString{

// method for reverse the given string
public static String reverseStr(String str){
	String reverse="";
	for(int i=str.length()-1; i>=0; i--){
		reverse+=str.charAt(i);
	}
	return reverse;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);

// Taking input from user
System.out.println("Enter the string");
String str=sc.next();
str=str.trim();

String result=reverseStr(str);
System.out.println("The reversed string is: " + result);
}
}