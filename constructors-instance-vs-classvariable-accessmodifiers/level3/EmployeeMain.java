package level3;

public class EmployeeMain {

    public static void main(String[] args) {

        Manager manager =
                new Manager(501, "IT", 75000);

        manager.setSalary(82000);
        manager.displayDetails();
    }
}


