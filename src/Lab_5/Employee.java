package Lab_5;

public class Employee {
    // Attributes
    private String employeeID;
    private String name;
    private static String designation = "Lab Attendant"; // Static attribute

    // Constructors
    public Employee() {
        // Default constructor
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    // Getter and Setter methods
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Static method to get the designation
    public static String getDesignation() {
        return designation;
    }

    // Static method to set the designation (if needed)
    public static void setDesignation(String newDesignation) {
        designation = newDesignation;
    }
}

