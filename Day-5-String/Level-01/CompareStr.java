import java.util.Scanner;
public class CompareStr{
	
	// method for compare strings
public static boolean compareStr(String s1, String s2){
	// check if strings length are equal or not
if(s1.length()!=s2.length()){
	return false;
}
for(int i=0; i<s1.length(); i++){
	if(s1.charAt(i)!=s2.charAt(i))
		return false;
}
return true;
};

public static void main(String[] args){
Scanner sc= new Scanner(System.in);

// take both strings as input from user
System.out.print("Enter string 1: ");
String s1= sc.next();

System.out.print("Enter string 2: ");
String s2= sc.next();

// compare strings using charAt method
System.out.println("compare using CharAt() method");
boolean result=compareStr(s1, s2);
if(result)
System.out.println("strings are equl");
else
	System.out.println("strings are not equal");

// compare strings using equals method
System.out.println("compare using equals() method");
if(s1.equals(s2))
	System.out.println("strings are equl");
else
	System.out.println("strings are not equal");

}
}