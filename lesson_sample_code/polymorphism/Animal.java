package lesson_sample_code.polymorphism;

public class Animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    //The class Animal has its own method called makeSound
    public void makeSound(){
        System.out.println("growl");
    }
}
