/**
 * Person class has that holds related data of a person.
 */
public class Person {

    /**
     * Attributes of Person class.
     * @param firstName
     * @param lastName
     * @param age
     */
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Parameterized constructor of Person class.
     * @param firstName
     * @param lastName
     * @param age
     */
    public Person (String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    /**
     * Getter methods for attributes.
     */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge(){

        return age;
    }


    /**
     *Setter methods for attributes.
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age;
    }

    /**
     * Using toString method to print out data.
     * @return toString
     */
    @Override
    public String toString() {
        return "Person{ " +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Age = " + age +
                '}';
    }

}


