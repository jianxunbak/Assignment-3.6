public class Teacher extends Person {
    private int teachedId;
    private String subject;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int birthYear, int teachedId, String subject, double salary) {
        super(name, birthYear);
        this.teachedId = teachedId;
        this.subject = subject;
        this.salary = salary;
    }

    // getters and setters

    public int getTeachedId() {
        return this.teachedId;
    }

    public void setTeachedId(int teachedId) {
        this.teachedId = teachedId;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
