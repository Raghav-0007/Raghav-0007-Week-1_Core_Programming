//Palindrome String Check

import java.util.Scanner;

public class PalindromeCheck {
	
	// method for check palindrom string
	public static boolean isPalindrom(String str){
		int left=0;
		int right=str.length()-1;
		while(left<right){
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	};

public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	
	// take user input
	System.out.println("Enter the string");
	String str=sc.next();
	
	// get the boolean result from method and print the result
	if(isPalindrom(str))
		System.out.println("Yes string is a palindrom");
	else
		System.out.println("No string is not a palindrom");
}
}