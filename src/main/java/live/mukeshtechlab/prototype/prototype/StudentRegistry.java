package live.mukeshtechlab.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Registers a student prototype in the registry.
 */

public class StudentRegistry {
    private Map<StudentType, Student> mapRegister;

    public StudentRegistry(){
        this.mapRegister = new HashMap<>();
    }

    public void register(StudentType studentType, Student student){
        mapRegister.put(studentType, student);
    }

    public Student get(StudentType studentType){
        return mapRegister.get(studentType);
    }

}
