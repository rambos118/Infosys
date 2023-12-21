package com.sdp.parth.day5; // Updated package name based on the directory structure

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentHashSetExample {

    public static void main(String[] args) {
        // Create a HashSet to store unique Student objects
        Set<Student> studentSet = new HashSet<>();

        // Create Student objects
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Doe", 102);
        Student student3 = new Student("Bob Smith", 101); // Duplicate rollNumber with student1

        // Add students to the HashSet
        addToHashSet(studentSet, student1);
        addToHashSet(studentSet, student2);
        addToHashSet(studentSet, student3);

        // Display the contents of the HashSet
        displayHashSetContents(studentSet);
    }

    // Method to add Student to HashSet, avoiding duplicates based on rollNumber
    private static void addToHashSet(Set<Student> studentSet, Student student) {
        if (studentSet.contains(student)) {
            System.out.println("Duplicate student not added: " + student);
        } else {
            studentSet.add(student);
            System.out.println("Student added: " + student);
        }
    }

    // Method to display the contents of the HashSet
    private static void displayHashSetContents(Set<Student> studentSet) {
        System.out.println("HashSet Contents:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
