import java.util.ArrayList;

//extends keyword link student child class to person parent class so that it can access all the parent class methods and instances field
public class Student extends Person {
    // instance field
    private int studentId;
    private String course;
    private int yearEnrolled;
    private ArrayList<Double> grades;

    // constructors
    public Student() {
    }

    // public Student(int studentId, String course, int yearEnrolled) {
    // this.studentId = studentId;
    // this.course = course;
    // this.yearEnrolled = yearEnrolled;
    // this.grades = new ArrayList<Double>();
    // }

    public Student(String name, int birthYear, int studentId, String course, int yearEnrolled) {
        super(name, birthYear); // super keyword is to call the parent class's constructor
        this.studentId = studentId;
        this.course = course;
        this.yearEnrolled = yearEnrolled;
        this.grades = new ArrayList<Double>();
    }

    // instance methods
    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public void attendClass() {
        System.out.println(this.name + " is attending class.");
    }

    // getters and setters
    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearEnrolled() {
        return this.yearEnrolled;
    }

    public void setYearEnrolled(int yearEnrolled) {
        this.yearEnrolled = yearEnrolled;
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

}
