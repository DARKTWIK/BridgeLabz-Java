// Creating Class with name PenDistribution indicating the purpose is to 
// divide pens equally among students and find remaining pens
class PenDistribution {
   public static void main(String[] args) {

      // Given values
      int totalPens = 14;
      int students = 3;

      // Calculate pens per student using division
      int pensPerStudent = totalPens / students;

      // Calculate remaining pens using modulus operator
      int remainingPens = totalPens % students;

      // Print the result
      System.out.println("The Pen Per Student is " + pensPerStudent +
                         " and the remaining pen not distributed is " + remainingPens);
   }
}

