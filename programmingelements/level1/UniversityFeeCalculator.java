// Creating Class with name UniversityFeeCalculator indicating the purpose is to 
// calculate discount and final fee to be paid
class UniversityFeeCalculator {
   public static void main(String[] args) {

      // Given values
      double fee = 125000;
      double discountPercent = 10;

      // Calculate discount amount
      double discount = (fee * discountPercent) / 100;

      // Calculate final fee after discount
      double finalFee = fee - discount;

      // Print the result
      System.out.println("The discount amount is INR " + discount +
                         " and final discounted fee is INR " + finalFee);
   }
}

