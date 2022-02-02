/**
 * PartTimeHourly class which extends Employee abstract class and,
 * is designed for part time employees.
 */
public class PartTimeHourly extends Employee {

    /**
     * Only attribute of our class.
     * @param baseHourlyPay
     */
    private double baseHourlyPay;

    /**
     * non-parameterized constructor for PartTimeHourly.
     */
    public PartTimeHourly() {

    }

    /**
     * parameterized constructor for PartTimeHourly.
     * @param firstname
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param pay
     */
    public PartTimeHourly(String firstname, String lastName,
                          Address address, String ssn, int id, double pay) {

        super(firstname, lastName, address, ssn, id);
        this.baseHourlyPay = pay;
    }


    /**
     *Setter and getter methods for attributes of our class.
     */
    public double getBaseHourlyPay() {

        return baseHourlyPay;
    }

    public void setBaseHourlyPay(double baseHourlyPay) {

        this.baseHourlyPay = baseHourlyPay;
    }


    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {
        return super.toString() +"Part Time Hourly{" +
                "base Hourly Pay= " + baseHourlyPay +
                "} " ;
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
        if(numHrs > 40) {

            salary = -1;
        }

        else if(numHrs <= 40) {

            salary = numHrs * baseHourlyPay;
        }
        return salary;
    }

}
