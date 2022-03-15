package lesson_sample_code.inheritance;

public class Teacher extends Person{
    //WE DO
    //Inherit the Person class
    //Create 2 properties called school and subject with getters and setters
    protected String school;
    protected String subject;

    public String getSchool(){
        return this.school;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    //Create constructors that calls the parent's empty and parameterized constructors
    public Teacher(){}

    public Teacher(String name, int age, String school, String subject){
        super(name, age);
        this.school = school;
        this.subject = subject;
    }
}
