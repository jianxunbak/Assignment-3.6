package lesson_sample_code.inheritance;

public class Person {
    //Create a class called Person with name and age
    //The Person class would be the parent class of the other two classes.
    //Inheritance is a concept wherein classes can inherit the properties and methods of other classes.
    //This is useful as certain classes can serve as common classes which can be inherited by other classes
    //In this example, the class Person is created with properties name and age which the Employee and Teacher classes will inherit.
    //This means that all employees and teachers are persons AND have properties and methods a person has.

    //Properties
    protected String name;
    protected int age;

    //Constructor
    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters / Setters
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //Method
    public void greet(){
        System.out.println("Hi, nice to meet you, my name is " + this.name);
    }
}
