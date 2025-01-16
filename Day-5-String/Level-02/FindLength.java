import java.util.Scanner;

public class FindLength{
	
	// method for finding the length of given string
	public static int findLength(String str){
		int count=0;
		// Handle the Exception 
		try{
			while(true){
				str.charAt(count);
				count++;
			}
		} catch(IndexOutOfBoundsException e){
			
		}
		return count;
	};

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter the string :");
String str=sc.next();

int len1=findLength(str);

int len2=str.length();

System.out.println("The length of string is (manual): " + len1 + "The length of string is (using in-built method): " + len2);
}
}