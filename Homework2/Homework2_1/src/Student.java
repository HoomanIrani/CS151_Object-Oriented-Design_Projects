public class Student {

    /**
     *Our Student class which includes all the data and methods.
     */

    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;

    /**
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param gpa
     * @param major
     * @param department
     */

    public Student(String firstName, String lastName, int age, double gpa, String major, String department) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }
    /**
     *Primary constructor of our class.
     */


    /**
     * getter method
     * @return lastName
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * Setter method
     * @param lastName
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * getter method
     * @return firstName
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * Setter method
     * @param firstName
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }


    /**
     * getter method
     * @return age
     */
    public int getAge() {

        return age;
    }

    /**
     * Setter method
     * @param age
     */
    public void setAge(int age) {

        this.age = age;
    }


    /**
     * getter method
     * @return gpa
     */
    public double getGpa() {

        return gpa;
    }

    /**
     * Setter method
     * @param gpa
     */
    public void setGpa(double gpa) {

        this.gpa = gpa;
    }


    /**
     * getter method
     * @return major
     */
    public String getMajor() {

        return major;
    }

    /**
     * Setter method
     * @param major
     */
    public void setMajor(String major) {

        this.major = major;
    }


    /**
     * getter method
     * @return department
     */
    public String getDepartment() {

        return department;
    }

    /**
     * Setter method
     * @param department
     */
    public void setDepartment(String department) {

        this.department = department;
    }


    /**
     * Non-static inner class Course which check for student and print the schedule.
     */
    public class Course {

        /**
         * This is a method that match student information with its schedule and print them out.
         */
        public void printSchedule() {

            if(lastName.equals("Smith") && firstName.equals("John") && age == 20 &&
            gpa == 3.60 && major.equals("Computer Science") && department.equals("School of Computer Science")) {

                System.out.println("CS 151 Mon/Wed 6-7:15 PM");
                System.out.println("CS 154 Tue/Thur 12-1:15 PM");
                System.out.println("CS 175 Tue/Thur 7:30-8:45 PM");
                System.out.println("METR 112 Online");
            }

            else {

                System.out.println("Information Does not match!");
            }

        }

    }

}
