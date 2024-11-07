public class App {
    public static void main(String[] args) {
        Person john = new Person("John", 1988);
        john.setBirthYear(0);
        john.greet();
        john.doWork();
        // Student child class
        Student student = new Student("Peter", 1990, 1, "Computer Science", 2024);
        student.greet();
        student.doWork();

        // Calling methods from the Person (parent) class
        // Java performs method lookup - lookup inheritance chain
        // checks if Student has setName method
        // if not, goes to the Parent to check
        // calling methods from student child class
        System.out.println("I am studying " + student.getCourse());
        student.addGrade(90);
        student.addGrade(80);
        System.out.println("My average grade is " + student.getAverageGrade());

        // Because all Java classes are subclasses of Object
        // even if you don't explicitly extend it
        System.out.println(student.toString());

        Teacher teacher = new Teacher("John", 1975, 1, "Mathematics", 5000);
        // Calling Parent class methods
        teacher.greet();
        teacher.doWork();
        // Calling Child class methods
        System.out.println("I teach " + teacher.getSubject());
        System.out.println("My salary is $" + teacher.getSalary());

    }
}
