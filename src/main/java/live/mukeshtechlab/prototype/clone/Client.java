package live.mukeshtechlab.prototype.clone;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(88);
        marks.add(95);
        marks.add(75);

        Student student = new Student("Mukesh", 24, marks);
        Student studentCopy = (Student) student.clone();

        System.out.println("DEBUG");
    }
}
