public class StudentRegistration {
    private String studentName;
    private double age;
    private int admissionNumber;
    private int rollNumber;
    private static int counter = 1001;

    public StudentRegistration(String studentName, double age, int admissionNumber) {
        this.studentName = studentName;
        this.age = age;
        this.admissionNumber = admissionNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getAge() {
        return age;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void generateRollNumber() {
        if (rollNumber == 0) {
            rollNumber = counter++;
        } else {
            System.out.println("Roll number already generated for the student.");
        }
    }

    @Override
    public int hashCode() {
        return studentName.hashCode() + Double.hashCode(age) + admissionNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        StudentRegistration that = (StudentRegistration) obj;
        return studentName.equals(that.studentName) &&
               age == that.age &&
               admissionNumber == that.admissionNumber;
    }
}