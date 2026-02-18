public class EmployeeEditor {
    public static void createEmployee(String fname, String lname, String dob) {
        String firstName = fname;
        String lastName = lname;
        String birthDate = dob;

        System.out.println("Succesfully created: " + fname + " " + lname + " " + birthDate);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Editor");
    }
}
