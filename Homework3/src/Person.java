/**
 *
 * public Abstract class Person which holds all attributes and method related to a Person.
 */

public abstract class Person {

    /**
     *Attributes of Person class:
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     */

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;


    /**
     * default constructor.
     */

    public Person() {

    }

    /**
     * Parameterized constructor for Person class with its attributes.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     */

    public Person(String firstName, String lastName, Address address, String ssn) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.ssn = ssn;
    }


    /**
     *All setter and getter methods for Person class in order to supply them in a more
     * efficent way.
     */
    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getSsn() {

        return ssn;
    }

    public void setSsn(String ssn) {

        this.ssn = ssn;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    /**
     * Overriding toString class
     * @return
     */

    @Override
    public String toString() {
        return "\n\nPerson{" +
                "first Name= '" + firstName + '\'' +
                ", last Name= '" + lastName + '\'' +
                ",Address= " + address +" , ";
    }
}

