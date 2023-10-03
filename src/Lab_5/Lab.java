package Lab_5;

public class Lab {
    String labID;
    Computer[] computers;
    LabStatus status;
    Employee labAttendent;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendent) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendent = labAttendent;
    }

    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }
    }

    public void removeComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == computer) {
                computers[i] = null;
                break;
            }
        }
    }


    public Computer getComputerByNumber(String computerNumber) {
        for (Computer computer : computers)
            if (computer != null && computer.getLcdModel().equals(computerNumber)) {
                return computer;
            }
        return null;
}
}
