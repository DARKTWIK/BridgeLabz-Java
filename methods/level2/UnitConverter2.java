package level2;

/*
 * Class Name  : UnitConverter
 * Description : Utility class for unit conversion operations
 *               (Distance and length conversions)
 */
public class UnitConverter2 {

    /* ---------------- Conversion Constants ---------------- */

    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    /* ---------------- Existing Methods ---------------- */

    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    /* ---------------- New Methods ---------------- */

    /*
     * Converts yards to feet
     */
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    /*
     * Converts feet to yards
     */
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    /*
     * Converts meters to inches
     */
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    /*
     * Converts inches to meters
     */
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    /*
     * Converts inches to centimeters
     */
    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM;
    }

    /*
     * Private constructor to prevent object creation
     */
    private UnitConverter2() {
        // Utility class – no instances allowed
    }
}
