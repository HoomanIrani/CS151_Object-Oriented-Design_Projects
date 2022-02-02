/**
 * public class FullTimeSalaried which extends FullTimeEmployee class and define its unique elements.
 */
public class FullTimeSalaried extends FullTimeEmployee {

    /**
     * non-parameterized constructors.
     */
    public FullTimeSalaried() {

    }

    /**
     * parameterized constructor and its attributes.
     * @param firstName
     * @param lastName
     * @param add
     * @param ssn
     * @param id
     * @param salary
     */
    public FullTimeSalaried(String firstName, String lastName,
                            Address add, String ssn, int id, double salary) {

        super(firstName, lastName, add, ssn, id, salary);
    }

    /**
     *Overriding toString method to properly format data.
     */
    @Override
    public String toString() {

        return super.toString() + " Full Time Salaried, Weekly salary is: " + getBasePay();
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
     * @param numWeeks
     * @return numWeeks * getBasePay()
     */
    public double computePay(int numWeeks) {

        return numWeeks * getBasePay();
    }

}
