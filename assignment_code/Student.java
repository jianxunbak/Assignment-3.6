package assignment_code;

public class Student extends Person{
    private int yrLevel;

    public Student(int yrLevel) {
        this.yrLevel = yrLevel;
    }

    public Student() {
    }

    public Student(String name, int age, String gender, int yrLevel){
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    public int getYrLevel() {
        return this.yrLevel;
    }

    public void setYrLevel(int yrLevel) {
        this.yrLevel = yrLevel;
    }

    public void introduce(){
        System.out.println("Hello, my name is " + this.name + ", and I am a level " + this.yrLevel + " student");
    }
}
