package model;
public class Student {
    private String studentName;
    private int studentId;
    private int studentAge;
    private String email;
    // defining the constructure
    public Student(String studentName, int studentId, int studentAge, String email){
        this.email = email;
        this.studentAge = studentAge;
        this.studentId = studentId;
        this.studentName = studentName;

    }
    // defining getters
    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public String getEmail(){
        return email;
    }
    //defining setters
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
