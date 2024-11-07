public class Person {
    // Instance fields
    protected String name; // protected means the field is accessible by the current and child class
    private int birthYear;
    private int currentYear = java.time.Year.now().getValue();

    // Constructors
    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Instance methods
    public void greet() {
        System.out.println(
                "Hello, my name is " + this.name + " and I am a " + (this.currentYear - this.birthYear)
                        + " year old " + this.getClass().getSimpleName().toLowerCase() + ".");
    }

    public void doWork() {
        System.out.println(this.name + " is working.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 1900 || birthYear > this.currentYear) {
            System.out.println("Invalid birth year.");
            return;
        }
        this.birthYear = birthYear;
    }

}