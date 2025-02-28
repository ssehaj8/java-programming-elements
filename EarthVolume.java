public class EarthVolume {
    public static void main(String[] args) {
        // Define constants
        float pi = 3.1415927f;
        float radiusKm = 6378f; 

        //Earth in cubic kilometers
        float volumeKm3 = (4.0f / 3.0f) * pi * (radiusKm * radiusKm * radiusKm);

        // Convert the volume from cubic kilometers to cubic miles
        // 1 km^3 = 0.239913 cubic miles
        float volumeMiles3 = volumeKm3 * 0.239913f;

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
