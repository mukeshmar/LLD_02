package live.mukeshtechlab.builder.production;

public class Client {
    public static void main(String[] args) {

        Student mukesh = Student.builder().setName("Mukesh").setAge(24).setGradYear(2025).setPsp(96).build();
        Student saumya = Student.builder().setName("Saumya").setAge(21).setGradYear(2025).setPsp(100).build();
        System.out.println("DEBUG");

    }
}
