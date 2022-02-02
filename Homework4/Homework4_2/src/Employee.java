public class Employee {

    /**
     * Attributes of class Employee:
     * @param firstName
     * @param lastName
     * @param id
     * @param hourlyPay
     */
    private String firstName;
    private String lastName;
    private int id;
    private double hourlyPay;

    /**
     * Parameterized constructor for Employee class.
     * @param firstName
     * @param lastName
     * @param id
     * @param hourlyPay
     */
    public Employee (String firstName, String lastName, int id, double hourlyPay) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    /**
     * Getter methods for Employee class attributes.
     */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getId() {

        return id;
    }

    public double getHourlyPay() {

        return hourlyPay;
    }

    /**
     * Setter methods for Employee class attributes.
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setHourlyPay(double hourlyPay) {

        this.hourlyPay = hourlyPay;
    }


    /**
     * ComputePay method which calculate employees salary and make sure input is proper,
     * with use of try-catch block and exceptions.
     * @param hour
     */
    public void computePay(int hour) {

        try {
            if (hour > 40) {

                throw new TooManyHoursWorkedException("Worker does not allow to work more than 40 hours!");

            }
            else if (hour < 0) {

                throw new NumberFormatException("Hours worked must be a positive number!");

            }
            else {

                System.out.println("Employee salary: " + (hour * hourlyPay));
            }


        } catch (TooManyHoursWorkedException | NumberFormatException e) {

            System.out.println(e);
        }

    }

}
