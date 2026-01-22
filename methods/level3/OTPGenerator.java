package level3;

/*
 * Program Name : OTPGenerator
 * Description  : Generates 6-digit OTP numbers and validates uniqueness
 */
public class OTPGenerator {

    private static final int OTP_COUNT = 10;
    private static final int OTP_LENGTH = 6;

    public static void main(String[] args) {

        /* ---------------- Generate OTPs ---------------- */

        int[] otpArray = new int[OTP_COUNT];

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateSixDigitOTP();
        }

        /* ---------------- Display OTPs ---------------- */

        System.out.println("Generated OTPs:");

        for (int otp : otpArray) {
            System.out.println(otp);
        }

        /* ---------------- Check Uniqueness ---------------- */

        boolean areUnique = areOTPsUnique(otpArray);

        System.out.println("\nAre all OTPs unique? : " + (areUnique ? "YES" : "NO"));
    }

    /*
     * Method Name  : generateSixDigitOTP
     * Description  : Generates a random 6-digit OTP
     * Return Type  : int
     */
    public static int generateSixDigitOTP() {

        // Generates number from 100000 to 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    /*
     * Method Name  : areOTPsUnique
     * Description  : Checks whether all OTP numbers are unique
     * Return Type  : boolean
     */
    public static boolean areOTPsUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {

            for (int j = i + 1; j < otpArray.length; j++) {

                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

