package Lab_5;

public class Main {
    public static void main(String[] args) {
        // Create some computers
        Computer computer1 = new Computer("001", "Model1", 8, 500, true);
        Computer computer2 = new Computer("002", "Model2", 16, 1000, false);

        // Create an attendant
        Employee attendant = new Employee("A001", "John Doe");

        // Create a lab
        Lab lab1 = new Lab("Lab001", new Computer[5], LabStatus.OPERATIONAL, attendant);

        // Add computers to the lab
        System.out.println(computer1);



    }
}

