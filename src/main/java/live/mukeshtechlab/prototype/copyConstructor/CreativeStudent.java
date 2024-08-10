package live.mukeshtechlab.prototype.copyConstructor;

import java.util.List;

public class CreativeStudent extends Student {

    private int creativityLevel;

    public CreativeStudent(String name, int age, List<Integer> marks, int creativityLevel) {
        super(name, age, marks);
        this.creativityLevel = creativityLevel;
    }

    public CreativeStudent(CreativeStudent creativeStudent) {
        super(creativeStudent);
        this.creativityLevel = creativeStudent.creativityLevel;
    }
}
