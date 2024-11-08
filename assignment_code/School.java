package assignment_code;

public class School implements Building {
    // instance fields
    private String name;
    private int numberOfFloors;
    private String address;

    // constructors

    public School() {
    }

    public School(String name, int numberOfFloors, String address) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
    }

    // methods
    @Override
    public void addFloor(int floor) {
        this.numberOfFloors += floor;
    }

    @Override
    public void describe() {
        System.out.println("Name: " + this.name + "\n" + "Address: " + this.address);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
