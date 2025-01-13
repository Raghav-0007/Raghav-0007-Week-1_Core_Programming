
import java.util.Scanner;

public class SimpleInterest{
	
	// Create a method for calculating simple interest
	public static double simpleInterest(double principal, double rate, double time){
		double SI=principal*rate*time/100;
		return SI;
	};
	
public static void main(String[] args){

// Create an Scanner object to take user input
Scanner sc= new Scanner(System.in);

// take input from user
System.out.println("Enter the principal: ");
double principal=sc.nextDouble();

System.out.println("Enter the Rate: ");
double rate=sc.nextDouble();

System.out.println("Enter the Time: ");
double time=sc.nextDouble();

// gate the result from method
double result=simpleInterest(principal, rate, time);
System.out.println("The Simple Interest is " + result + " for Principal " + principal + " Rate of Interest " + rate + " and Time " + time);
}
}