// Client class to demonstrate the Prototype pattern
package live.mukeshtechlab.prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoCopyConstructor();
    }

    /**
     * Demonstrates the Prototype pattern by creating a registry of students
     * and cloning them.
     */
    private static void demoCopyConstructor() {
        // Create a list of marks
        List<Integer> marks = new ArrayList<>();
        marks.add(88);
        marks.add(95);
        marks.add(75);

        // Create different types of students
        Student student = new Student("Mukesh", 24, marks);
        Student intelligentStudent = new IntelligentStudent("Bhavesh", 20, marks, 150);
        Student creativeStudent = new CreativeStudent("Saumya", 21, marks, 250);

        // Create a student registry
        StudentRegistry studentRegistry = new StudentRegistry();

        // Register students in the registry
        studentRegistry.register(StudentType.STUDENT, student);
        studentRegistry.register(StudentType.INTELLIGENT_STUDENT, intelligentStudent);
        studentRegistry.register(StudentType.CREATIVE_STUDENT, creativeStudent);

        // Retrieve and clone students from the registry
        Student studentCopy = studentRegistry.get(StudentType.STUDENT).copy();
        Student intelligentStudentCopy = studentRegistry.get(StudentType.INTELLIGENT_STUDENT).copy();
        Student creativeStudentCopy = studentRegistry.get(StudentType.CREATIVE_STUDENT).copy();

        // Note: The copy() method is called on the retrieved student objects
        // to create a deep copy of the objects.

        System.out.println("DEBUG");
    }
}