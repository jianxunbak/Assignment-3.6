package assignment_code;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public Teacher(String name, int age, String gender, String subject){
        super(name, age, gender);
        this.subject = subject;
    }

    public void introduce(){
        System.out.println("Hello, my name is " + this.name + ", and I will be teaching you " + this.subject);
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
