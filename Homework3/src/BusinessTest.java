/**
 * @author Houman Irani
 * @version 1.2
 * @since 02-26-2021
 *
 *
 * BusinessTest class which executes the program.
 * I created all the necessary objects for this class as mentioned.
 */
public class BusinessTest {

    public static void main(String[] args) {

        /**
         * creating different Address instances to use them for people.
         */
        Address add1 = new Address(10189, "Viceroy Ct.",
                "Cupertino", "95014", "CA");

        Address add2 = new Address(550, "Weddell Dr.",
                "Sunnyvale", "94089", "CA");

        Address add3 = new Address(1356, "Via Romero",
                "Palos Verdes Estate", "90274", "CA");

        Address add4 =  new Address(325, "Kirschner Ln",
                "Placentia", "92870", "CA");

        Address add5 = new Address(29375, "Indian Valley Rd.",
                "Rancho Palos Verdes", "90275", "CA");

        Address add6 = new Address(16371, "Shadburn ave.",
                "Placentia", "92870", "CA");

        Address add7 = new Address(1247, "Franklin St.",
                "San Francisco", "94103", "CA");

        Address add8 = new Address(7, "Sunset Ave.",
                "San Francisco", "94107", "CA");

        Address add9 = new Address(420, "N Rodeo Dr.",
                "Beverly Hills", "90210", "CA");

        Address add10 = new Address(2323, "ShoreLine dr.",
                "Newport Beach", "92677", "CA");

        Address add11 = new Address(110, "Broadway Ave.",
                "New York", "10001", "CA");

        Address add12 = new Address(12867, "7th Ave.",
                "New York", "10012", "CA");


/**
 * All the object created for each types of employee and customers. (2 for each)
 */
        Customer cs1 = new Customer("John", "Smith",
                add1, "465788021", 4672, "Cash");
        cs1.introduce();
        cs1.makePayment();

        Customer cs2 = new Customer("Adi", "Hasting",
                add2, "465749022", 4671, "Credit Card");
        cs2.introduce();
        cs2.makePayment();


        Contractor c1 = new Contractor("Houman", "Irani", add3, "123456789", 2543, 62.5);
        c1.introduce(true);
        System.out.println("Employee Salary is: " +c1.computePay(40));

        Contractor c2 = new Contractor("Allan", "Johnson", add4, "566230789", 2549, 33.0);
        c1.introduce(true);
        System.out.println("Employee Salary is: " +c2.computePay(32));


        PartTimeHourly pt1 = new PartTimeHourly("Mike", "Brown", add5, "311768906", 4576, 37.3);
        pt1.introduce(true);
        System.out.println("Employee Salary is: " +pt1.computePay(35));

        PartTimeHourly pt2 = new PartTimeHourly("Ali", "Davis", add6, "911768906", 4579, 29.0);
        pt1.introduce(false);
        System.out.println("Employee Salary is: " +pt2.computePay(30));


        FullTimeHourly fth1 = new FullTimeHourly("Adam", "Sanchez",
                add7, "118556902", 7655, 40.0, 60.0);
        fth1.introduce(true);
        System.out.println("Employee Salary is: " +fth1.computePay(45));

        FullTimeHourly fth2 = new FullTimeHourly("Andy", "Garcia",
                add8, "345654778", 7652, 64.0, 96.0);
        fth2.introduce(true);
        System.out.println("Employee Salary is: " +fth2.computePay(48));


        FullTimeSalaried fts1 = new FullTimeSalaried("Darwin", "Rodriguez",
                add9, "977544335", 8756, 3500.0);
        fts1.introduce(true);
        System.out.println("Employee Salary is: " +fts1.computePay(48));

        FullTimeSalaried fts2 = new FullTimeSalaried("Jo", "Moore",
                add10, "3224565411", 8747, 2752.0);
        fts2.introduce(false);
        System.out.println("Employee Salary is: " +fts2.computePay(50));


        Executive e1 = new Executive("Gary", "Taylor",
                add11, "411322678", 9822, 600000.0, 1100000);
        e1.introduce(true);
        System.out.println("Employee Salary is: " +e1.computePay());

        Executive e2 = new Executive("Michael", "Lee",
                add12, "534877909", 9827, 400000.0, 670000);
        e2.introduce(false);
        System.out.println("Employee Salary: " +e1.computePay());

    }

}
