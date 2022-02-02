/**
 *Person is our super class that holds all of the person attributes and methods.
 */
public class Person {

    /**
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param gender
     * @param weight
     */
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private double weight;

    /**
     *Person parameterized constructor that call all attributes.
     */
    public Person(String firstName, String lastName, int age, String ssn, String address,
                  String gender, double weight){


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }


    /**
     * getter method for firstname
     * @return firstname
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * setter method for firstname
     * @param firstName
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * getter method for lastname
     * @return lastname
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * setter method for lastname
     * @param lastName
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * getter method for age
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * setter method for age
     * @param age
     */
    public void setAge(int age) {

        this.age = age;
    }

    /**
     * getter method for ssn
     * @return ssn
     */
    public String getSsn() {

        return ssn;
    }

    /**
     * setter method for ssn
     * @param ssn
     */
    public void setSsn(String ssn) {

        this.ssn = ssn;
    }

    /**
     * getter method for address
     * @return address
     */
    public String getAddress() {

        return address;
    }

    /**
     * setter method for address
     * @param address
     */
    public void setAddress(String address) {

        this.address = address;
    }

    /**
     * getter method for gender
     * @return gender
     */
    public String getGender() {

        return gender;
    }

    /**
     * setter method for gender
     * @param gender
     */
    public void setGender(String gender) {

        this.gender = gender;
    }

    /**
     * getter method for weight
     * @return weight
     */
    public double getWeight() {

        return weight;
    }

    /**
     * settee method for weight
     * @param weight
     */
    public void setWeight(double weight) {

        this.weight = weight;
    }


    /**
     * overriding method toString
     * @return
     */
    @Override
    public String toString() {

        return ("\n" +firstName +" " +lastName + ", " +age + " years old, resident of " +address +". His/Her SSN is "
                +ssn + " and identified as a " +gender + ",\nHis/Her weight is " +weight +" pounds.");
    }


    /**
     * method introduce to print out all the person information and data.
     */
    public void introduce() {

        System.out.println(toString());

    }


}
