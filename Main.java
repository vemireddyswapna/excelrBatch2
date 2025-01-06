class Employee {
    // Attributes of Employee class
    int id;
    String fullname;
    String lastname;
    String address;

    // Constructor to initialize the Employee details
    public Employee(int id, String fullname, String lastname, String address) {
        this.id = id;
        this.fullname = fullname;
        this.lastname = lastname;
        this.address = address;
    }

    // Method to display the Employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Full Name: " + fullname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Address: " + address);
    }
}


class EmployeeDetails extends Employee {

   
    public EmployeeDetails(int id, String fullname, String lastname, String address) {
        super(id, fullname, lastname, address);  
    }
    
   
}

public class Main {
    public static void main(String[] args) {
        
        EmployeeDetails emp = new EmployeeDetails(101, "John", "Doe", "1234 Elm St");
        
       
        emp.displayDetails();
    }
}
