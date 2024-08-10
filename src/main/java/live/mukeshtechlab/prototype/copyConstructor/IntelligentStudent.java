package live.mukeshtechlab.prototype.copyConstructor;

import java.util.List;

public class IntelligentStudent extends Student{
    private int intelligenceLevel;

    public IntelligentStudent(String name, int age, List<Integer> marks, int intelligenceLevel) {
        super(name, age, marks);
        this.intelligenceLevel = intelligenceLevel;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.intelligenceLevel = intelligentStudent.intelligenceLevel;
    }
}
