package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Classroom {

    private Student[] students;

    public Classroom(int MaxNumberOfStudents) {

    }

    public Classroom(Student[] students){

    }

    public Classroom(){
        this.students = new Student[30];
    }

    public int getStudents(){
        return students.length;
    }

    public double getAverageExamScore(){
        double sum = 0;
        for(Student s : students){
            sum += s.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.toArray(students);
    }

    public void removeStudent(String firstName, String lastName){

    }

    public void getStudentsByScore(){
    }

    public void getGradeBook(){
        HashMap<String, Character> gradeBook = new HashMap<>();
        int maxNumStudents = students.length;
//        Student[] listStudent = getStudentsByScore();
//
//        for(Student s : listStudent){
//            double grade = 1 / (( maxNumStudents) * ((double) 100));
//
//        }
    }
}
