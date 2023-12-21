// Trainee.java
public class Trainee implements DataProvider {
    private int marksSecured;

    // Constructor
    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    // Method to calculate overall percentage
    public double calcPercentage() {
        int totalMarks = marksSecured + COURSE_MARKS_B;
        return ((double) totalMarks / TOTAL_MAXIMUM_MARKS) * 100;
    }
}
