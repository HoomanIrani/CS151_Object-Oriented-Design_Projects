public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;


    public Person(){}

    public Person(String firstName, String lastName, int age, String ssn, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nAge: " +
                age + "\nAddress: " + address;

    }

}