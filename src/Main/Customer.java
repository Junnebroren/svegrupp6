package Main;

public class Customer {
    private String ssn;
    private int age;
    private String name;
    private String address;

    public Customer(String ssn, int age, String name, String address) {
        this.ssn = ssn;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

