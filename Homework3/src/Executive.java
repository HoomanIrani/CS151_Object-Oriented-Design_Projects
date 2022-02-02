/**
 * Executive class that extends abstract class Employee and print out Executives data and income.
 */
public class Executive extends Employee {

    /**
     * attributes of Executive class:
     * @param yearlyBonus
     * @param yearlyCompensation
     */
    private double yearlyBonus;
    private double yearlyCompensation;

    /**
     * non-parametrized constructor
     */
    public Executive() {

    }

    /**
     * parameterized constructor with its attributes:
     * @param firstName
     * @param lastName
     * @param address
     * @param ssn
     * @param id
     * @param pay
     * @param bonus
     */
    public Executive(String firstName, String lastName, Address address, String ssn,
                     int id, double pay, double bonus) {

        super(firstName, lastName, address, ssn, id);
        this.yearlyCompensation = pay;
        this.yearlyBonus = bonus;
    }


    /**
     *Setter and getter methods for attributes of our class.
     */
    public double getYearlyBonus() {

        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {

        this.yearlyBonus = yearlyBonus;
    }

    public double getYearlyCompensation() {

        return yearlyCompensation;
    }

    public void setYearlyCompensation(double yearlyCompensation) {

        this.yearlyCompensation = yearlyCompensation;
    }


    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {
        return super.toString() +"Executive{" +
                "yearly Bonus= " + yearlyBonus +
                ", yearly Compensation= " + yearlyCompensation +
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
     * @return yearlyCompensation + yearlyBonus
     */
    public double computePay() {

        return yearlyCompensation + yearlyBonus;
    }


}
