package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ClassroomTest {

    Random random = new Random(System.currentTimeMillis());

    public Double[] generateTestScores(){
        ArrayList<Double> testScores = new ArrayList<>();
        int numberTests = random.nextInt(10);
        for (int i = 0; i < numberTests; i++) {
            testScores.add(random.nextDouble());
        }
        Double[] arrTestScores = testScores.toArray(Double[]::new);
        return arrTestScores;
    }

    public String getStudentNames(){
        try{
            File names = new File("target/test-classes/first-names.txt");
            Scanner scan = new Scanner(names);
            int nameIndex = random.nextInt(4945);
            int i = 0;
            while(scan.hasNextLine()){
                String name = scan.nextLine();
                if(i == nameIndex){
                    return name;
                }
                i++;
            }
            return "neal";
        } catch (FileNotFoundException f){
            return "johnson";
        }
    }

    public Student[] generateStudents(int num){
        ArrayList<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < num; i++){
            String firstName = getStudentNames();
            String lastName = getStudentNames();
            Double[] testScores = generateTestScores();
            studentsList.add(new Student(firstName, lastName, testScores));
        }
        return studentsList.toArray(Student[]::new);
    }

    @Test
    public void getStudents() {
        Student[] students = generateStudents(5);
        Student[] students1 = generateStudents(5);
        Assert.assertEquals(students.length, students1.length);
    }

    @Test
    public void removeStudentTest() {
        Student[] students = generateStudents(10);
        Student student = students[3];
        Classroom classroom = new Classroom(students);
        classroom.removeStudent(student.getFirstName(), student.getLastName());
        Assert.assertEquals(students.length, classroom.getStudents().length);
        Assert.assertTrue(Arrays.asList(classroom.getStudents()).contains(null));
    }
}
