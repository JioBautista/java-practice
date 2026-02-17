public class Practice {
    public static void welcomeMessage() {
        System.out.println("WELCOME TO ADP");
    }

    public static void exitMessage() {
        System.out.println("This person does not belong in the company. Try again");
    }

    public static void createEmployee(String fname, String lname) {
        String firstName = fname;
        String lastName = lname;
        String fullName = firstName + " " + lastName;
        System.out.println("This employee has been added to the system: " + fullName);
    }

    //    Method overload
    public static void createEmployee(int id) {
        int employeeID = id;
        String message = "HELLO";
        System.out.println("Employee: " + employeeID);
    }

    public static void main(String[] args) {
        createEmployee("Jio", "Pacho");
        createEmployee(325002350);
    }
}
