/**
 * Abstract class Employee which inherit everything from Person and,
 * is designed for employees.
 */
public abstract class Employee extends Person {


    /**
     * attributes of Employee class:
     * @param id
     * @param educationLevel
     * @param @directDeposit
     */
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    /**
     * non-parameterized constructor for Employee abstract class.
     */
    public Employee() {

    }

    /**
     * parameterized constructor for Employee abstract class.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     */
    public Employee(String firstName, String lastName, Address address, String ssn, int id) {

        super(firstName, lastName, address, ssn);
        this.id = id;
    }


    /**
     *Setter and getter methods for attributes of our class.
     */
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getEducationLevel() {

        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {

        this.educationLevel = educationLevel;
    }

    public boolean isDirectDeposit() {

        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {

        this.directDeposit = directDeposit;
    }


    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {

        return super.toString();
    }


}
