package assignment_code;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void greet(String name){
        System.out.println("Nice to meet you, " + name);
    }

    public void introduce(){
        System.out.println("Hello, my name is " + this.name);
    }

    public void haveBirthday(){
        this.age += 1;
    }

}

