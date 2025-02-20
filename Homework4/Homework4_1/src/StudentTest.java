/**
 * @author Houman Irani
 * @version 1.00
 * @since 03-11-2021
 * <p>
 * Thia Application is designed to create a deep copy of student1 object.
 * </p>
 */

/**
 * StudentTest is the Main class to execute our program including main method.
 */
public class StudentTest {

    public static void main(String[] args) {

/**
 * creating course1 object and student1 and student2(empty object)
 */
        Course course1 = new Course("CS151", "Object Oriented design",
                "CS", "6:00 PM", "Tue");

        Student student1 = new Student("John", "Smith", 20, 3.6,
                "Computer Science major", "School of Computer Science department", course1);
        Student student2 = null;

/**
 *
 * cloning student1 using try-catch block.
 */
        try {

            student2 = (Student) student1.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
/**
 * printing student 1&2 information.
 */
        student1.printInfo();
        student2.printInfo();

        student2.setCourse("CS149", "Operation System",
                "CS", "4:30 PM", "Wed");
        student2.printInfo();
    }
}