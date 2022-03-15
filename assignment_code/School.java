package assignment_code;

public class School implements Building{
    private String name;
    private String address;
    private int numberOfFloors;


    public School() {
    }

    public School(String name, String address, int numberOfFloors) {
        this.name = name;
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void addFloor(int floors){
        this.numberOfFloors += floors;
    }

    public String describe(){
        return this.name + " is in " + this.address;
    }

}
