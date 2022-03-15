## Brief

### How to use the lesson sample code

There are four folders prepared for the lesson. 
- [Encapsulation](./lesson-sample-code/encapsulation)
- [Inheritance](./lesson-sample-code/inheritance)
- [Polymorphism](./lesson-sample-code/polymorphism)
- [Abstraction](./lesson-sample-code/abstraction)

Instructor to use the code provided for demonstration during the I DO segment. Learners will use the java file provided in the respective folder for practice during the WE DO segment.

### Any other announcements to instructors or learners

---

## Part 1 - Encapsulation

Open encapsulation folder and discuss concept of encapsulation in Pet.java

Encapsulation is used to hide the internal representation, or state of an object from the outside. This is called information hiding.
In order to do this, we add the access modifier keyword "private" to the attributes and add public accessor and mutator methods (getter and setters)

Recall the concept of constructors and accessor/mutator methods.

Use the Main.java class to demonstrate encapsulation.

WE DO: Have students create the Student.java following the rules of encapsulation.

---

## Part 2 - Inheritance

Open inheritance folder and discuss the parent class Person. Then, discuss Employee class to explain the "protected", "extends" and "super" keywords.

Inheritance is a concept wherein classes can inherit the properties and methods of other classes.
This is useful as certain classes can serve as common classes which can be inherited by other classes.
The "extends" keyword is used to denote that a class inherits from another class.
The "super" keyword is used for both constructors and methods to denote it uses the parent's constructor and methods.

Use the Main.java class to demonstrate inheritance

WE DO: Have students create the Teacher class from the parent class.

---

## Part 3 - Polymorphism

Open polymorphism folder to discuss polymorphism.

Polymorphism is the ability of a method to have  different behaviors in different situations.
There are two types of polymorphism.
1. Static or compile-time polymorphism
2. Dynamic or run-time polymorphism

Static polymorphism is achieved by function overloading.
This is done by defining the same function in the same class with different input parameters (number of parameters or type of parameters)
        
Demonstrate function overloading using StaticPoly class and show the differences between the 3 methods.

Dynamic or run-time polymorphism allows inherited classes to change the definition of any method of the parent class. This is called function overriding.

For function overriding, create the Animal and Cat classes and demonstrate how to override methods

WE DO: Have students create the Dog class and override the method.

## Part 4 - Abstraction

Open abstraction folder and create the PersonInterface interface and Instructor class.

Data Abstraction may be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. 

The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

Abstraction can be done in Java using interfaces.
An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods. It acts like a contract telling classes that use the interface that the class should implement the abstract methods.

The keyword abstract is used to define that the method needs to be overridden by another class.

Explain interfaces and abstract methods and demonstrate it using Main class.