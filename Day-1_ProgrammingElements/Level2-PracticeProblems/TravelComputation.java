// Create TravelComputation Class to compute the Distance and Travel Time

import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {
	   
	   Scanner sc= new Scanner(System.in);

      // taking person name as input
	  System.out.println("Enter your name");
      String name = sc.getLine();
      
      // taking city names as input
	  System.out.println("Enter fromCity name");
      String fromCity = sc.getLine();
	  System.out.println("Enter viaCity name");
	  String viaCity = sc.getLine();
	  System.out.println("Enter toCity name");
	  String toCity = sc.getLine();

      // taking distance as input
	  System.out.println("Enter distance From To Via");
      double distanceFromToVia = sc.nextDouble();
	  System.out.println("Enter distance Via To Final City");
	  double distanceViaToFinalCity = sc.nextDouble();

      // taking time taken as input
	  System.out.println("Enter time From To Via");
      int timeFromToVia = sc.nextInt();
	  System.out.println("Enter time Via To Final City");
      int timeViaToFinalCity = sc.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;
	  
      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
						 
						 sc.close();
   }
}


