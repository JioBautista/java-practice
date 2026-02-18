public class Practice {
    public static void welcomeMessage() {
        System.out.println("WELCOME TO ADP");
    }


    public static void main(String[] args) {
        welcomeMessage();
        EmployeeEditor employee1 = new EmployeeEditor();
        EmployeeEditor employee2 = new EmployeeEditor();
        employee1.createEmployee("Jio", "Bautista", "January 11 1994");
        employee2.createEmployee("Chewy", "Choco", "2113");
    }
}
