package assignment_code;

public class Teacher extends Person {
    // instance fields
    private String subject;

    // constructors
    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    // methods
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and i will be teaching you " + this.subject + ".");
    }

    // getters and setters
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
