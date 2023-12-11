public class Sub {
    private int[] marksArray = new int[5];

    public static void main(String[] args) {
        Sub subjectMarks = new Sub();

        // Store marks in the array
        subjectMarks.storeMarks(90, 85, 92, 88, 95);

        // Display marks using enhanced for loop
        subjectMarks.displayMarks();
    }

    // Method to store marks in the array
    private void storeMarks(int subject1, int subject2, int subject3, int subject4, int subject5) {
        marksArray[0] = subject1;
        marksArray[1] = subject2;
        marksArray[2] = subject3;
        marksArray[3] = subject4;
        marksArray[4] = subject5;
    }

    // Method to display marks using enhanced for loop
    private void displayMarks() {
        System.out.println("Subject Marks:");
        int subjectNumber = 1;
        for (int marks : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + marks);
            subjectNumber++;
        }
    }
}
