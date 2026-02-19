public class Employee {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String address;
        String dateOfBirth;
        System.out.println("This is the Employee superclass");
    }

    interface Actions {
        public void signIn();

        public void signOut();
    }
}
