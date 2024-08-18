// Person.java
public class Person {
    // Properties
    private String name;
    private int age;
    private String gender;

    // Parameterized Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // greet method
    public void greet(String otherName) {
        System.out.println("Nice to meet you, " + otherName);
    }

    // introduce method
    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    // haveBirthday method
    public void haveBirthday() {
        this.age += 1;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
