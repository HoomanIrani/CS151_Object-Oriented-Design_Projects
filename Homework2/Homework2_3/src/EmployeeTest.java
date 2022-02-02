/**
@author Houman Irani
@version 1.00
@since 02-15-2021
<p>
 This program calculate employee's salary and print out their information.
<p>
 * Main class (EmployeeTest) for executing the program.
 */

public class EmployeeTest {

    public static void main(String[] args) {

/**
 *
 * Created 5 objects and filled them with specific instances and then called both methods.
 */
        Employee e1 = new Employee("John", "Smith", 30, "567832909",
                "San Francisco", "Male", 176.5, 2349648, "Contractor", 60);

        e1.introduce();
        System.out.println("Salary: " +e1.calculatePay(40));



        Employee e2 = new Employee("Lisa", "Gray", 42, "654233980",
                "Miami", "Female", 123.4, 14398444, "Full time", 110000);

        e2.introduce();
        System.out.println("Salary: " +e2.calculatePay(2));



        Employee e3 = new Employee("Timothy", "Briggs",56, "344587699",
                "Cupertino", "Male", 190, 1345632, "Full time", 80000);

        e3.introduce();
        System.out.println("Salary: " +e3.calculatePay(2));



        Employee e4 = new Employee("George", "Wallace", 67, "455327689",
                "Palo Alto", "Male", 188.9, 7656689, "Part time", 20);

        e4.introduce();
        System.out.println("Salary: " +e4.calculatePay(25));



        Employee e5 = new Employee("Amy", "Student", 21, "544366911",
                "New York", "Female", 105.0, 5446590, "Contractor", 45);

        e5.introduce();
        System.out.println("Salary: " +e5.calculatePay(45));

        
    }
}
