/**
 *class Employee is inheritance of class Person, it has all attributes and fields of Person.
 */
public class Employee extends Person {

    /**
     * Employee class unique parameters.
     * @param id
     * @param status
     * @param basePay
     */
    private int id;
    private String status;
    private double basePay;

    /**
     *Employee constructor which inherit all of person attributes too.
     */
    public Employee(String firstName, String lastName, int age, String ssn, String address,
                    String gender, double weight, int id, String status, double basePay) {


        super(firstName, lastName, age, ssn, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;

    }


    /**
     * getter method for id
     * @return id
     */
    public int getId() {

        return id;
    }

    /**
     * setter method for id
     * @param id
     */
    public void setId(int id) {

        this.id = id;
    }

    /**
     * getter method for status
     * @return status
     */
    public String getStatus() {

        return status;
    }

    /**
     * setter method for status
     * @param status
     */
    public void setStatus(String status) {

        this.status = status;
    }

    /**
     * getter method for basePay
     * @return basePay
     */
    public double getBasePay() {

        return basePay;
    }

    /**
     * setter method for basePay
     * @param basePay
     */
    public void setBasePay(double basePay) {

        this.basePay = basePay;
    }


    /**
     * overriding method toString to sort and return employees data
     * @return
     */
    @Override
    public String toString() {

        if (this.status.equals(("Full time"))) {

            return super.toString()  +" Employee ID: " +this.id + "Employment status is:"  +this.status
                    +",Pay is $" +this.basePay +"/yr. Should get paid or working weekly.";
        }

        else if (status.equals("Part time") || (status.equals("Contractor"))) {

    return super.toString()  +" Employee ID: " +this.id + " ,and Employment status is: "  +this.status
            +", Pay is $" +this.basePay +"/hr. Should get paid or working hourly.";
       }

        return null;
    }


    /**
     * overriding method introduce to print out employee data
     */
    @Override
    public void introduce() {

        System.out.println(this.toString());

    }


    /**
     * Employee method, calculatePay for calculating employees salary.
     * @param unitsWorked
     * @return salary
     */
    public double calculatePay(double unitsWorked) {

        double salary = 0;

        if(status.equals("Full time")){

            salary = (basePay / 52) * unitsWorked;
        }

        else if(status.equals("Part time") || (status.equals("Contractor"))) {

            salary = basePay * unitsWorked;
        }

        return salary;
    }

}