package assignment_code;

public class Main {
    public static void main(String args[]) {
        School school = new School("NUS", 5, "Kent Ridge");
        Teacher teacher = new Teacher("Micheal", 40, "Male", "Science");
        Student student1 = new Student("John", 23, "Male", "first");
        Student student2 = new Student("Jane", 24, "Female", "second");

        school.addFloor(5);
        System.out.println("Number of floors in school: " + school.getNumberOfFloors());
        school.describe();
        teacher.introduce();
        student1.introduce();
        student2.introduce();
    }

}
