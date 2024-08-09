package live.mukeshtechlab.builder.production;

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

    // Builder class for Student class
    public static class StudentBuilder {
        private String name;
        private int age;
        private String batch;
        private String phoneNumber;
        private String email;
        private String univName;
        private int gradYear;
        private double psp;

        // Method to create a Student object
        public Student build(){
            return new Student(this);
        }


        // Setter
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        // Getter
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getBatch() {
            return batch;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public String getUnivName() {
            return univName;
        }

        public int getGradYear() {
            return gradYear;
        }

        public double getPsp() {
            return psp;
        }
    }
}
