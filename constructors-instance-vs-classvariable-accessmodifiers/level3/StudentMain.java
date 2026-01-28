package level3;

public class StudentMain {

    public static void main(String[] args) {

        PostgraduateStudent student =
                new PostgraduateStudent(101, "Sasi Kiran", 8.5);

        student.setCgpa(8.9);
        student.displayDetails();
    }
}

