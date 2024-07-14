package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    Double[] examScores = new Double[]{80.0,90.0,95.0};

    @Test
    public void getFirstName() {
        Student student = new Student();
        student.setFirstName("t");
        Assert.assertEquals("t", student.getFirstName());
    }

    @Test
    public void getLastName() {
        Student student = new Student();
        student.setLastName("t");
        Assert.assertEquals("t", student.getLastName());
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScores() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void getAverageExamScore() {
    }
}