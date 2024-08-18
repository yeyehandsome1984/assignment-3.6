// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a School object
        School mySchool = new School("Green Valley High", 3, "123 Elm Street");

        // Add floors to the school
        mySchool.addFloor(2);

        // Describe the school
        mySchool.describe();

        // Create a Teacher object
        Teacher teacher = new Teacher("Mr. Smith", 40, "Male", "Mathematics");

        // Create Student objects
        Student student1 = new Student("Alice", 16, "Female", "10th");
        Student student2 = new Student("Bob", 15, "Male", "9th");

        // Use methods
        teacher.introduce();
        
        student1.introduce();
        student2.introduce();

        // Use greet method from Person class
        student1.greet("Mr. Smith");
        student2.greet("Mr. Smith");
    }
}
