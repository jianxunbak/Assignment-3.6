package lesson_sample_code.polymorphism;

public class Dog extends Animal {
    //WE DO
    //Dynamic or run-time polymorphism allows inherited classes to change the definition of any method of the parent class. This is called function overriding.
    private String breed;

    public Dog(){
        super();
    }

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void makeSound(){
        //Override makeSound
    }
}
