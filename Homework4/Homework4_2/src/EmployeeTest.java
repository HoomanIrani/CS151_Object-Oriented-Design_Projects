/**
 * @author Houman Irani
 * @version 1.00
 * @since 03-13-2021
 * <p>
 * This Application calculate employees salary and make sure input is in proper format.
 * </p>
 */

public class EmployeeTest {

    public static void main(String[] args) {

        /**
         * creating instance of Employee class and enter the data inside computePay method.
         */
        Employee e1 = new Employee("John", "Smith", 101, 35.00);

        e1.computePay(40);
        e1.computePay(23);
        e1.computePay(1);
        e1.computePay(0);
        e1.computePay(-5);
        e1.computePay(45);

    }
}
