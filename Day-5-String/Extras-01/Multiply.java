// multiplication of array

import java.util.*;

public class Multiply{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int[] arr={3, 5, 6, 4, 6, 7, 8, 9, 13};
long multiply=1;
for(int i=0; i<arr.length; i++){
multiply=multiply*arr[i];
}
System.out.println("multiply of the array is: " + multiply);
}
}