import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Declaring the height array of size 11
		int[] heights = new int[11];
		
		// Input heights
		System.out.println("Enter the heights of 11 people in range of 150 cm to 250 cm: ");
		for(int i=0; i<11; i++) {
			heights[i] = input.nextInt();
		}
		
		//Object creation
		Height obj = new Height();
		
		// method calling 
		int sumOfHeight = obj.getTotal(heights);
		System.out.println("Total of heights: " + sumOfHeight);
		
		double meanOfHeight = obj.getMean(sumOfHeight);
		System.out.println("Mean of heights: " + meanOfHeight);

		int shortestOfHeight = obj.getShortest(heights);
		System.out.println("Shortest of heights: " + shortestOfHeight);
		
		int tallestOfHeight = obj.getTallest(heights);
		System.out.println("Tallest of heights: " + tallestOfHeight);
		
		// Closing the scanner object
		input.close();
	}
	
	// Method declarations
	public int getTotal(int[] heights) {
		int total = 0;
		
		for(int i=0; i<11; i++) {
			total += heights[i];
		}
		
		return total;
	}
	
	// Method declarations
	public double getMean(int total) {
		double mean = total / 11.0;
		return mean;
	}
	
	// Method declarations for shortest
	public int getShortest(int[] heights) {
		int shorter = heights[0];
		
		for(int i=1; i<11; i++) {
			shorter = Math.min(shorter, heights[i]);
		}
		
		return shorter;
	}
	
	// Method declarations for tallest
	public int getTallest(int[] heights) {
		int taller = heights[0];
		
		for(int i=1; i<11; i++) {
			taller = Math.max(taller, heights[i]);
		}
		
		return taller;
	}
}