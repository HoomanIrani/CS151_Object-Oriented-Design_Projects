/**
 * Abstract class FullTimeEmployee which extends Employee and,
 * is dedicated to employees that are full time.
 */
public abstract class FullTimeEmployee extends Employee {

    /**
     * single attributes belong to FullTimeEmployee.
     * @param basePay
     */
    private double basePay;

    /**
     * non-parameterized constructor for FullTimeEmployee.
     */
    public FullTimeEmployee() {

    }

    /**
     * parameterized constructor for FullTimeEmployee.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param basePay
     */
    public FullTimeEmployee(String firstName, String lastName,
                            Address address, String ssn, int id, double basePay) {

        super(firstName, lastName, address, ssn, id);
        this.basePay = basePay;
    }

    /**
     *Setter and getter methods for attributes of our class.
     */
    public double getBasePay() {

        return basePay;
    }


    public void setBasePay(double basePay) {

        this.basePay = basePay;
    }

}
