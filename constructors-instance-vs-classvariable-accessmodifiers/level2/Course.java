package level2;

public class Course {

    // Instance variables
    private String courseName;
    private int duration;     // in hours
    private double fee;

    // Class variable
    private static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " hours");
        System.out.println("Fee           : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

