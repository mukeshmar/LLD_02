package live.mukeshtechlab.builder.basic;


public class StudentBuilder {
    private String name;
    private int age;
    private String batch;
    private String phoneNumber;
    private String email;
    private String univName;
    private int gradYear;
    private double psp;


    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setPsp(double psp) {
        this.psp = psp;
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
