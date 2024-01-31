package src.Student;

public class Student implements Demos{
   private String name;
   private String pass;


    public Student(String name, String pass){
        this.name = name;
        this.pass = pass;
    }
    public String getName(){
        return this.name;
    }
    public String getPass(){
        return this.pass;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    //////////////////////////////////////

    public void play(){
        System.out.println("Student is playing");
    }
    public void walk(){
        System.out.println("Student is walking");
    }
    public void sleep(){
        System.out.println("Student is sleeping");
    }
    


     
}
