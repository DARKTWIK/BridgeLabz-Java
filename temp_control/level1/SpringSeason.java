// Creating Class with name SpringSeason indicating the purpose is to 
// check whether the given date falls in the Spring Season
class SpringSeason {

   public static void main(String[] args) {

      // Get month and day from command line arguments
      int month = Integer.parseInt(args[0]);
      int day = Integer.parseInt(args[1]);

      // Check if the given date is in Spring Season (March 20 to June 20)
      boolean isSpringSeason =
            (month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20);

      // Print the result
      if (isSpringSeason) {
         System.out.println("Its a Spring Season");
      } else {
         System.out.println("Not a Spring Season");
      }
   }
}
