public class EarthVolume {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Calculate the volume of the Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * (radiusKm*radiusKm*radiusKm);

        // Convert the volume to cubic miles
        double radiusMiles = radiusKm * 0.621371;
		
		// Calculate the volume of the Earth in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * (radiusKm*radiusKm*radiusKm);

        // Print the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and in cubic miles is " + volumeMiles3);
    }
}
