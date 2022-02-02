/**
 * public class Contractor that extends Employee class and have its unique charactristics.
 */
public class Contractor extends Employee {

    /**
     * private attribute of Contractor class
     * @param basePay
     */
    private double basePay;

    /**
     * non-parameterized constructor.
     */
    public Contractor() {

    }

    /**
     * Parametrized constructor with its attributes.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param pay
     */
    public Contractor(String firstName, String lastName, Address address, String ssn, int id, double pay) {

        super(firstName, lastName, address,ssn, id);
        this.basePay = pay;
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

    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {
        return super.toString() +"Constructor{ " +
                "base Pay= " + basePay +
                '}';
    }

    /**
     * introduce method to print out toString data.
     */
    public void introduce(boolean displaySSN) {

        if(displaySSN == true){

            System.out.println(toString());
            System.out.println("Employee SSN: " +getSsn());
        }

        else {

            System.out.println(toString());
        }
    }


    /**
     * specific method to calculate salary of each types of employee.
     * @param numHrs
     * @return salary
     */
    public double computePay(int numHrs) {

        double salary = 0;
        salary = basePay * numHrs;

        return salary;
    }

}
