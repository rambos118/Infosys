import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;
    private int totalMarks;

    public Student(String name, int rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // add toString() method
    @Override
    public String toString() {
        return "Student name = " + name + ", rollNumber = " + rollNumber;
    }

    // add appropriate method for avoiding duplicate Student
    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return rollNumber == s.rollNumber || Objects.equals(getName(), s.name);
    }
}
