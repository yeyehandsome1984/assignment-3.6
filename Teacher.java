// Teacher.java
public class Teacher extends Person {
    // Additional Property
    private String subject;

    // Parameterized Constructor
    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    // Override introduce method
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + " and I will be teaching you " + subject + ".");
    }

    // Getter and Setter for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
