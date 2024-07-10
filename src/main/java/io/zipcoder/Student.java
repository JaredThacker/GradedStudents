package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores(){
        String scores = "";
        int i = 1;
        for (double score : examScores){
            scores += "Exam" + i + ":" + score;
            i++;
            scores += "\n";
        }
        return scores;
    }

//    public ArrayList<Double> getExamScores(){
//        return examScores;
//    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public double getAverageExamScore(){
        double sum = 0;
        for(double scores : examScores){
            sum += scores;
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ").append(firstName).append(" ").append(lastName).append("\n");
        sb.append("> Average Score: ").append(getAverageExamScore()).append("\n");
        sb.append("> Exam Scores: ").append(getExamScores()).append("\n");
        sb.append(getExamScores());
        return sb.toString();
//        return firstName + lastName + getAverageExamScore() + getExamScores();
    }
}
