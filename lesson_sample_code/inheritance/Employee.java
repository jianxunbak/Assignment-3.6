package lesson_sample_code.inheritance;

public class Employee extends Person{
    //The extends keyword is used to denote that a class inherits from another class.
    //Attributes can be created and it would the attribute of the child class
    private String employeeId;
    private String department;

    //Constructors
    public Employee(){
        super();
        //The super keyword for constructor means that it is calling the parent's constructor.
    }

    public Employee(String name, int age, String employeeId, String department){
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    //Getters and Setters
    public String getEmployeeId(){
        return this.employeeId;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    //Method
    public void report(){
        System.out.println(super.getName() + "reporting in");
        //The super keyword can also be used to call the methods of the parent class.
    }

}
