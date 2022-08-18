package lesson_sample_code.abstraction;

public interface PersonInterface {
  // Data Abstraction may be defined as the process of identifying only the
  // required characteristics of an object ignoring the irrelevant details.
  // The properties and behaviours of an object differentiate it from other
  // objects of similar type and also help in classifying/grouping the objects.
  // Abstraction can be done in Java using interfaces.
  // An interface in Java is a blueprint of a class. A Java interface contains
  // static constants and abstract methods. It acts like a contract telling
  // classes that use the interface that the class should implement the abstract
  // methods.
  // The keyword abstract is used to define that the method needs to be overridden
  // by another class

  abstract void greet();

  abstract String teach(String food);
}
