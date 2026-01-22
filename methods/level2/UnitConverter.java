package level2;

/*
 * Class Name  : UnitConverter
 * Description : Utility class for unit conversion operations
 *               (Kilometers ↔ Miles, Meters ↔ Feet)
 */
public class UnitConverter {

    /* ---------------- Conversion Constants ---------------- */

    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    /*
     * Converts kilometers to miles
     */
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    /*
     * Converts miles to kilometers
     */
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    /*
     * Converts meters to feet
     */
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    /*
     * Converts feet to meters
     */
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    /*
     * Private constructor to prevent object creation
     */
    private UnitConverter() {
        // Utility class – no instances allowed
    }
}

