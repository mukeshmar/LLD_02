package live.mukeshtechlab.builder.basic;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String phoneNumber;
    private String email;
    private String univName;
    private String gradYear;
    private double psp;

    public Student(StudentBuilder builder){
        if(builder.getGradYear() < 2024){
            throw new RuntimeException("Graduation year must be >= 2024");
        }
        if(builder.getPsp() < 70){
            throw new RuntimeException("Psp must be >= 70");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNumber = builder.getPhoneNumber();
        this.email = builder.getEmail();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getUnivName();
        this.psp = builder.getPsp();
    }

    // Get Builder for this class
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
}
