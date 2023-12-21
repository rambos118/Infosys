// Intern.java
public class Intern implements DataProvider {
    private int marksSecured;
    private int graceMarks;

    // Constructor
    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    // Method to calculate overall percentage
    public double calcPercentage() {
        int totalMarks = marksSecured + graceMarks + CO_CURRICULAR_MARKS_A;
        if (marksSecured > COURSE_MARKS_A) {
            System.out.println("Please enter the correct marks");
            return 100.0;
        }
        return ((double) totalMarks / TOTAL_MAXIMUM_MARKS) * 100;
    }
}
