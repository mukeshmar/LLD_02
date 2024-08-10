package live.mukeshtechlab.prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private List<Integer> marks;

    // Constructor
    public Student(String name, int age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Copy Constructor
    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.marks = new ArrayList<Integer>(student.marks);
    }


    @Override
    public Student copy() {
        return new Student(this);
    }
}
