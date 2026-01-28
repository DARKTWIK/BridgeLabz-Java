package level2;

public class CourseMain {

    public static void main(String[] args) {

        Course c1 = new Course("Java", 40, 5000);
        Course c2 = new Course("Python", 30, 4500);

        c1.displayCourseDetails();
        System.out.println();

        // Update institute name for all courses
        Course.updateInstituteName("Global Tech Institute");

        c2.displayCourseDetails();
    }
}

