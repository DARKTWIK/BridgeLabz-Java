package level3;

public class Manager extends Employee {

    public Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : " + getSalary());  // private via method
    }
}

