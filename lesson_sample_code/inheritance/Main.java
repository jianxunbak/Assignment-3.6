package lesson_sample_code.inheritance;

public class Main {
    public static void main(String args[]){
        Employee emp1 = new Employee("Chad", 33, "Emp1999", "Finance");
        Teacher teach1 = new Teacher("Karen", 56, "UCLA", "CompSci");
        Person p1 = new Person("Stanley", 33);
        emp1.greet();
        emp1.report();
        teach1.greet();
        p1.getName();
    }
}
