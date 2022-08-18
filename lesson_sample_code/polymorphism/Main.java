package lesson_sample_code.polymorphism;

public class Main {
  public static void main(String args[]) {
    // Create a new instance of Animal
    Animal animal1 = new Animal();
    animal1.makeSound();

    // Using the new keyword, the animal1 can be redefined as a Cat
    animal1 = new Cat();
    animal1.makeSound();
    // The makeSound method now prints Meow! as animal1 is now a Cat.

    // animal1 can also be changed to a Dog object
    animal1 = new Dog();
    animal1.makeSound();
    // The makeSound method now prints Woof! as animal1 is now a Dog.
  }
}
