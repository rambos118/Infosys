public class RegistrationTester {
    public static void main(String[] args) {
        // Create two student registration objects
        StudentRegistration student1 = new StudentRegistration("Peter", 23, 5001);
        StudentRegistration student2 = new StudentRegistration("Peter", 24, 5003);

        // Generate roll number for both students
        student1.generateRollNumber();
        student2.generateRollNumber();

        // Display student details
        displayStudentDetails(student1);
        displayStudentDetails(student2);

        // Compare objects and display the result
        if (student1.equals(student2)) {
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
    }

    private static void displayStudentDetails(StudentRegistration student) {
        System.out.println("Student Details");
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Admission Number: " + student.getAdmissionNumber());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println();
    }
}