package lesson_sample_code.encapsulation;

public class Main {
    public static void main(String args[]){
        Pet pet1 = new Pet();
        pet1.setName("Billy");
        pet1.setBreed("goat");
        pet1.setAge(3);

        System.out.println("My pet's name is" + pet1.getName());
    }
}
