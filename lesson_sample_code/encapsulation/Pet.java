package lesson_sample_code.encapsulation;

public class Pet {
    //As discussed in the previous lesson, encapsulation is the concept of of bundling data and methods that work on that data within one unit.
    //Encapsulation also is used to hide the internal representation, or state of an object from the outside. This is called information hiding.
    //In order to do this, we add the access modifier keyword "private" to the attributes and add public accessor and mutator methods (getter and setters)
    //The private keyword prevents direct access of the properties


    //Properties:
    private String name;
    private String breed;
    private int age;

    //Constructors
    public Pet(){}

    public Pet(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        //Recall the concept of this. The this keyword pertains to the object itself.
    }

    //Accessor methods / getters
    //Getters are used to get values of the properties
    //The naming convention for getters get<Property>
    //The public keyword is an access modifier that allows access from other classes.
    
    public String getName(){
        return this.name;
    }

    //We do - Create the other two accessors
    public String getBreed(){
        return this.breed;
    }

    public int getAge(){
        return this.age;
    }

    //Mutators / setters
    //setters are used to assign values to properties
    //The naming convention for setters is set<Property>
    public void setName(String name){
        this.name = name;
    }

    //We do - Create the other setters
    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }
}
