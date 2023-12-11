public class StudentTester {
    private int studentID;
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private float qualifyingMarks;
    public float getQualifyingMarks() {
        return qualifyingMarks;
    }
    public void setQualifyingMarks(float qualifyingMarks){
        this.qualifyingMarks = qualifyingMarks;
    }

    private char residentialStatus;
    public char getResidentialStatus() {
        return residentialStatus;
    }
    public void setResidentialStatus(char residenceStatus){
        this.residentialStatus = residenceStatus;
    }    

    private int yearOfEng;
    public int getYearOfEng() {
        return yearOfEng;
    } 
    public void setYearOfEng(int yearOfEng){
        this.yearOfEng = yearOfEng;
    }

    public static void main(String[] args) {
        StudentTester student = new StudentTester();
        int id = student.getStudentID();
        String name = student.getName();
        float qualifiedMarks = student.getQualifyingMarks();
        char residenceStatus = student.getResidentialStatus();
        int yearOf = student.getYearOfEng();
        student.setName("jacob");
        student.setStudentID(1001);
        student.setQualifyingMarks(80);
        student.setResidentialStatus('H');
        student.setYearOfEng(3);

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Qualifying marks: " + qualifiedMarks);
        System.out.println("Year of Engineering: " + yearOf);
        System.out.println("Residential status: " + residenceStatus);
    }
}
