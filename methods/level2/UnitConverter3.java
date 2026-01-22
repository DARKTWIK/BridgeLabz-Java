package level2;

/*
 * Class Name  : UnitConverter
 * Description : Utility class for unit conversion operations
 *               (Length, Temperature, Weight, and Volume)
 */
public class UnitConverter3 {

    /* ---------------- Length Conversion Constants ---------------- */

    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    /* ---------------- Temperature Conversion ---------------- */

    /*
     * Converts Fahrenheit to Celsius
     */
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    /*
     * Converts Celsius to Fahrenheit
     */
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /* ---------------- Weight Conversion Constants ---------------- */

    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;

    /*
     * Converts pounds to kilograms
     */
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    /*
     * Converts kilograms to pounds
     */
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    /* ---------------- Volume Conversion Constants ---------------- */

    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    /*
     * Converts gallons to liters
     */
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    /*
     * Converts liters to gallons
     */
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    /* ---------------- Previously Added Length Methods ---------------- */

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

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM;
    }

    /* ---------------- Private Constructor ---------------- */

    private UnitConverter3() {
        // Prevent instantiation
    }
}

