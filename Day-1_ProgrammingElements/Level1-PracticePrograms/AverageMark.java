import java.util.Scanner;

public class AverageMark{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int mathsMark=94;
int physicsMark=95;
int chemistryMark=98;
int totlaMark=100;
double averageMark=(mathsMark + physicsMark + (double)chemistryMark)/3;
System.out.println("Sam's average mark is: " + averageMark);
sc.close();
}
}