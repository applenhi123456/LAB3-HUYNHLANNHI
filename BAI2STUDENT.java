/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Student {
    private String stID;
    private String stName;
    private String stClass;
    
    // Constructors
    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }
    
    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    
    public Student(Student st) {
        this.stID = st.getStID();
        this.stName = st.getStName();
        this.stClass = st.getStClass();
    }
    
    // Getters and Setters
    public String getStID() {
        return this.stID;
    }
    
    public void setStID(String id) {
        this.stID = id;
    }
    
    public String getStName() {
        return this.stName;
    }
    
    public void setStName(String name) {
        this.stName = name;
    }
    
    public String getStClass() {
        return this.stClass;
    }
    
    public void setStClass(String className) {
        this.stClass = className;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "stID='" + stID + '\'' +
                ", stName='" + stName + '\'' +
                ", stClass='" + stClass + '\'' +
                '}';
    }
}