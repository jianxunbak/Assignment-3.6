package lesson_sample_code.polymorphism;

public class StaticPoly {
  public static void main(String args[]) {
    // Polymorphism is the ability of a method to have different behaviors in
    // different situations.
    // There are two types of polymorphism.
    // 1. Static or compile-time polymorphism
    // 2. Dynamic or run-time polymorphism

    // Static polymorphism is achieved by function overloading.
    // This is done by defining the same function in the same class with different
    // input parameters (number of parameters or type of parameters)

    System.out.println("Result: " + multiply(100.8f, 22.3f));
    System.out.println("Result: " + multiply(75, 199));
    System.out.println("Result: " + multiply(5, 19, 6));
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int multiply(int a, int b, int c) {
    return a * b * c;
  }

  public static float multiply(float a, float b) {
    return a * b;
  }
}
