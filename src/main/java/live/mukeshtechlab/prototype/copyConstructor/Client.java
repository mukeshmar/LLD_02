package live.mukeshtechlab.prototype.copyConstructor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoCopyConstructor();
    }

    /**
     * Demonstrates the use of copy constructors to create deep copies of objects.
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

        // Add students to a list
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(intelligentStudent);
        students.add(creativeStudent);

        // Create a new list to store copied students
        List<Student> studentsCopy = new ArrayList<>();

        // Copy each student in the original list
        for (Student currentStudent : students) {
            // Check the type of student and create a deep copy accordingly
            if (currentStudent instanceof IntelligentStudent) {
                // Cast Student to IntelligentStudent
                IntelligentStudent currIntelligentStudent = (IntelligentStudent) currentStudent;

                // Pass IntelligentStudent object to IntelligentStudent copy constructor
                studentsCopy.add(new IntelligentStudent(currIntelligentStudent));
            } else if (currentStudent instanceof CreativeStudent) {
                // Cast Student to CreativeStudent
                CreativeStudent currCreativeStudent = (CreativeStudent) currentStudent;
                studentsCopy.add(new CreativeStudent(currCreativeStudent));
            } else {
                // Create a deep copy of the Student object
                studentsCopy.add(new Student(currentStudent));
            }
        }

        System.out.println("DEBUG");
    }
}