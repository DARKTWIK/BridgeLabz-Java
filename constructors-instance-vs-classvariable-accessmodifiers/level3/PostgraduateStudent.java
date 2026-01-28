package level3;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name       : " + name);       // protected
        System.out.println("CGPA       : " + getCgpa());  // private via method
    }
}

