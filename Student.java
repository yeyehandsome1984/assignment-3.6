// Student.java
public class Student extends Person {
    // Additional Property
    private String yrLevel;

    // Parameterized Constructor
    public Student(String name, int age, String gender, String yrLevel) {
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    // Override introduce method
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + " and I am a " + yrLevel + " student.");
    }

    // Getter and Setter for yrLevel
    public String getYrLevel() {
        return yrLevel;
    }

    public void setYrLevel(String yrLevel) {
        this.yrLevel = yrLevel;
    }
}
