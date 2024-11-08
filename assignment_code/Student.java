package assignment_code;

public class Student extends Person {
    // instance fields
    private String yrLevel;

    // constructors
    public Student() {
    }

    public Student(String name, int age, String gender, String yrLevel) {
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    // methods
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am a " + this.yrLevel + " student.");
    }

    // getters and setters
    public String getYrLevel() {
        return this.yrLevel;
    }

    public void setYrLevel(String yrLevel) {
        this.yrLevel = yrLevel;
    }

}
