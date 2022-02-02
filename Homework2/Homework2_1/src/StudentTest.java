/**
 @author Houman Irani
 @version 1.00
 @since 02-15-2021
<p>
 This Program gets instances of students and print out their schedule.
 <p>
 * Main class (StudentTest) for executing the program.
 */


public class StudentTest {

    /**
     * @param args
     * main method of Main class(Student test)
     */
    public static void main(String[] args) {

        /**
         *
         * Instance of specific student and its object.
         */

        Student s1 = new Student("John","Smith", 20, 3.60,
                "Computer Science", "School of Computer Science");

        Student.Course sc = s1.new Course();

        /**
         * Using System.out.println to print out the schedule.
         */

        System.out.println("Your class schedule is:");
        System.out.println();

        sc.printSchedule();

    }

}