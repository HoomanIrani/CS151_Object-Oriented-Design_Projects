/**
 * public class FullTimeHourly which is part of FullTimeEmployee and has its unique characterized.
 */
public class FullTimeHourly extends FullTimeEmployee {

    /**
     * single attribute of our class.
     * @param overtimePay
     */
    private double overtimePay;

    /**
     * non-parameterized constructor.
     */
    public FullTimeHourly() {

    }

    /**
     * parameterized constructor.
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param basePay
     * @param overtimePay
     */
    public FullTimeHourly (String firstName, String lastName, Address address, String ssn,
                           int id, double basePay, double overtimePay) {

        super(firstName, lastName, address, ssn, id, basePay);
        this.overtimePay = overtimePay;
    }


    /**
     *Setter and getter methods for attributes of our class.
     */
    public double getOvertimePay() {

        return overtimePay;
    }


    public void setOvertimePay(double overtimePay) {

        this.overtimePay = overtimePay;
    }

    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {
        return super.toString() +"Full Time Hourly{ " +
                "Base Pay= " + getBasePay() + ", over time Pay= " + overtimePay +
                "} ";
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

        double salary = 0.0;
        if(numHrs > 40) {

            salary = (getBasePay() * numHrs) + ((numHrs - 40) * overtimePay);
        }

        else {

            salary = getBasePay() * numHrs;
        }

        return salary;
    }

}