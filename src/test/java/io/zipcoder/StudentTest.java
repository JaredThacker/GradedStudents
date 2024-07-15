package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

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
}