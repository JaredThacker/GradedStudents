package io.zipcoder;

import java.util.*;

public class Classroom {

    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return students;
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
        List<Student> studentsAsList = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < studentsAsList.size(); i++){

            Student student = studentsAsList.get(i);
            String studentFirstName = student.getFirstName();
            String studentLastName = student.getLastName();

            if(studentFirstName.equals(firstName) && studentLastName.equals(lastName)){
                studentsAsList.remove(i);
                studentsAsList.add(null);
                students = studentsAsList.toArray(Student[]::new);
                break;
            }
        }
    }

    public Student[] getStudentsByScore(){
        List<Student> studentsAsList = new ArrayList<>(Arrays.asList(students));
        studentsAsList.sort(Student::compareTo);
        Collections.reverse(studentsAsList);
        Student[] students = studentsAsList.toArray(Student[]::new);
        return students;
    }

    public HashMap<Student, Character> getGradeBook(){
        HashMap<Student, Character> gradeBook = new HashMap<>();
        int maxNumStudents = students.length;
        Student[] listStudent = getStudentsByScore();

        for(Student student : listStudent){
            double grade = 1 / (( maxNumStudents) * ((double) 100));

            if (grade <= 10)
                gradeBook.put(student, 'A');
            else if (grade >= 11 && grade <= 29)
                gradeBook.put(student, 'B');
            else if (grade >= 30 && grade <= 50)
                gradeBook.put(student, 'C');
            else if (grade >= 51 && grade <= 89)
                gradeBook.put(student, 'D');
            else
                gradeBook.put(student, 'F');

            }
        return gradeBook;
        }
    }
