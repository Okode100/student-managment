package model;
public class Student {
    private String name;
    private int id;
    private int age;
    private String email;
    // defining the constructure
    public Student(int id, String name, int age, String email){
        this.email = email;
        this.age = age;
        this.id = id;
        this.name = name;

    }
    // defining getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    //defining setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
