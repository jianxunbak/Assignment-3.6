package lesson_sample_code.polymorphism;

public class Cat extends Animal {
    //Dynamic or run-time polymorphism allows inherited classes to change the definition of any method of the parent class. This is called function overriding.
    private String breed;

    public Cat(){
        super();
    }

    public Cat(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    //The inherited method makeSound from the Animal class is redefined to suit the needs of the current class. The method is "overridden" and would have a new definition.
    public void makeSound(){
        System.out.println("Meow!");
    }
}
