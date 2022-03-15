package lesson_sample_code.abstraction;

public class Instructor implements PersonInterface{
    //The implements keyword allows the Instructor class to use the PersonInterface
    //Classes can implement multiple interfaces compared to inheritance which can only be done once.
    private String name;

    public Instructor(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Since the PersonInterface has been implemented in the Instructor class, it now has the responsibility to implement the abstract classes. This can be done using the @Override annotation that states that the method has been overridden
    @Override
    public void greet(){
        System.out.println("Hello World");
    }

    @Override
    public String teach(String food){
        return "I love to teach  " + food;
    }

    //The advantage of using interfaces is that it is up to the developer to implement the methods depending on the implementing class.
}
