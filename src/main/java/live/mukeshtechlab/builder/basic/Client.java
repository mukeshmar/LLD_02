package live.mukeshtechlab.builder.basic;

public class Client {
    public static void main(String[] args) {
        // Builder
        StudentBuilder builder = Student.builder();
        builder.setName("Mukesh");
        builder.setAge(24);
        builder.setGradYear(2025);
        builder.setPsp(96.0);

        // Creating Student class using builder
        Student student = new Student(builder);

        System.out.println("DEBUG");
    }
}
