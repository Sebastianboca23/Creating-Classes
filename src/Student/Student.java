/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author 18442
 */
public class Student {
    
    private int gradeYear;
    private double gpa;
    private int id;
    
    
    public Student(int pGradeYear, double pGPA, int pID){
        gradeYear = pGradeYear;
        gpa = pGPA;
        id = pID;
        
        
    }
    
    public int getgradeYear(){
        return gradeYear;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public int getID(){
        return id;   
    }
    
    public void setgradeYear(int pGradeYear){
        gradeYear = pGradeYear; 
    }
    
    public void setGPA(double pGPA){
        gpa = pGPA;
    }
    
    public void setID(int pID){
        id = pID;
    }
    
    @Override
    public String toString(){
        return "Students class year: " + gradeYear + "\n"
                + "Students GPA: " + gpa + "\n"
                + "Students id: " + id;
    }
    
}
