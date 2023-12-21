// File: StudentGradeProcessor.java
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentGradeProcessor {

    public static void main(String[] args) {
        Set<Student> s1 = new HashSet<>();
        s1.add(new Student("Shashank", 1, 90));
        s1.add(new Student("Nikhil", 2, 40));
        s1.add(new Student("Karan", 3, 50));
        s1.add(new Student("Karan", 1, 10));

        Map<Integer, String> m = new TreeMap<>();
        for (Student s : s1) {
            if (s.getTotalMarks() >= 60 && s.getTotalMarks() <= 100) {
                m.put(s.getRollNumber(), "A");
            } else if (s.getTotalMarks() >= 40 && s.getTotalMarks() < 60) {
                m.put(s.getRollNumber(), "B");
            } else if (s.getTotalMarks() >= 0 && s.getTotalMarks() < 40) {
                m.put(s.getRollNumber(), "C");
            } else {
                System.out.println("Please check your total marks !!");
            }
        }

        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(" Roll number : " + entry.getKey() + " Grade : " + entry.getValue());
        }
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int totalMarks;

    public Student(String name, int rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}
