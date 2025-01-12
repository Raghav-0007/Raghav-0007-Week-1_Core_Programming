import java.util.Scanner;

public class ConvertDistance{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double kilometer=10.8;
double miles=kilometer/1.6;
System.out.println(" The distance " + kilometer + " km in miles is " + miles);
sc.close();
}
}