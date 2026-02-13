public class Practice {
    public static void main(String[] args) {
//        Non-primitive data types
        String firstName = "Jio";
        String lastName = "Pacho";
//        Primitive data-types
        int age = 32;
        final int employeeNum = 235002350;
        var companyName = "Rexall";
        boolean isEmployee = true;

        if (isEmployee) {
            System.out.println("This person is an employee to " + companyName);
            System.out.println(firstName + " " + lastName + " " + age + " " + employeeNum);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("This person is NOT an employee to " + companyName);
        }
    }
}
