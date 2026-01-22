package level1;

/*
 * Program Name : SpringSeason
 * Description  : Checks whether a given date falls in the Spring Season
 *                (March 20 to June 20)
 */
class SpringSeason {

    public static void main(String[] args) {

        /* ---------------- Command Line Argument Validation ---------------- */

        if (args.length != 2) {
            System.err.println("Usage: java SpringSeason <month> <day>");
            System.exit(0);
        }

        int month;
        int day;

        try {
            month = Integer.parseInt(args[0]);
            day = Integer.parseInt(args[1]);
        } catch (NumberFormatException exception) {
            System.err.println("Error: Month and Day must be valid integers.");
            System.exit(0);
            return;
        }

        /* ---------------- Date Validation ---------------- */

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.err.println("Error: Invalid month or day value.");
            System.exit(0);
        }

        /* ---------------- Spring Season Check ---------------- */

        boolean isSpring = isSpringSeason(month, day);

        /* ---------------- Display Result ---------------- */

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    /*
     * Method Name : isSpringSeason
     * Description : Checks if the given date lies between March 20 and June 20
     * Parameters  : month, day
     * Return Type : boolean
     */
    public static boolean isSpringSeason(int month, int day) {

        // March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }

        // April and May (full months)
        if (month == 4 || month == 5) {
            return true;
        }

        // June 1 to June 20
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }

        return false;
    }
}

