/**
 * Public class Customer which inherit all attributes and fields of Person class, and
 * also it defines new characters for customers.
 */
public class Customer extends Person {

    /**
     * Attributes exclusive to Customer class.
     * @param customerID
     * @param payPreference
     */
    private int customerID;
    private String payPreference;

    /**
     * non-parameterized constructor for Customer class.
     */
    public Customer() {

        super();
    }

    /**
     * parameterized constructor for Customer class.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param payPreference
     */
    public Customer(String firstName, String lastName, Address address, String ssn, int id, String payPreference) {

        super(firstName, lastName, address, ssn);
        this.customerID = id;
        this.payPreference = payPreference;
    }


    /**
     * All the setters and getters for attributes of Customer class.
     */
    public int getCustomerID() {

        return customerID;
    }

    public void setCustomerID(int customerID) {

        this.customerID = customerID;
    }

    public String getPayPreference() {

        return payPreference;
    }

    public void setPayPreference(String payPreference) {

        this.payPreference = payPreference;
    }


    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {
        return super.toString() +"Customer{ " +
                "customer ID= " + customerID +
                ", pay Preference= '" + payPreference + '\'' +
                '}';
    }


    /**
     * introduce method to print out toString data.
     */
    public void introduce() {

        System.out.println(toString());
    }

    /**
     * makePayment method to print out prefered type of method by customer.
     */
    public void makePayment() {

        System.out.println("Preferred payment method: " +payPreference);

    }


}
