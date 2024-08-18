// School.java
public class School implements Building {
    // Properties
    private String name;
    private int numberOfFloors;
    private String address;

    // Parameterized Constructor
    public School(String name, int numberOfFloors, String address) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
    }

    // Implement addFloor method
    @Override
    public void addFloor(int floors) {
        this.numberOfFloors += floors;
    }

    // Implement describe method
    @Override
    public void describe() {
        System.out.println("School Name: " + name);
        System.out.println("Address: " + address);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
