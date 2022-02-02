/**
 * Built in API for data structure.
 */
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Student class which takes information of students and print out their schedule.
 */
public class Student {

    /**
     * Attributes of Student class:
     * @param firstName
     * @param lastName
     * @param gpa
     * @param age
     * @param major
     * @param department
     * @param courses
     */
    private String firstName;
    private String lastName;
    private double gpa;
    private int age;
    private String major;
    private String department;
    private LinkedList<Course> courses;

    /**
     * Parameterized constructor of Student class.
     * @param firstName
     * @param lastName
     * @param gpa
     * @param age
     * @param major
     * @param department
     * @param courses
     */
    public Student(String firstName, String lastName, double gpa,
                   int age, String major, String department, LinkedList<Course> courses) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.age = age;
        this.major = major;
        this.department = department;
        this.courses = courses;
    }


    /**
     * Getter methods for attributes of our class.
     */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public double getGpa() {

        return gpa;
    }

    public int getAge() {

        return age;
    }

    public String getMajor() {

        return major;
    }

    public String getDepartment() {

        return department;
    }

    public LinkedList<Course> getCourses() {

        return courses;
    }


    /**
     *Setter methods for attributes of our class.
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setMajor(String major) {

        this.major = major;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setCourses(LinkedList<Course> courses) {

        this.courses = courses;
    }


    /**
     * addCourse method to add a class for student.
     * @param course
     */
    public void addCourse(Course course) {

        courses.add(course);
    }

    /**
     * removeCourse method to remove a course from student schedule.
     * @param course
     */
    public void removeCourse(Course course) {

        courses.remove(course);
    }

    /**
     * sortCourse method to sort student course in the given order.
     * @param c
     * @param category
     * @param str
     */
    public void sortCourses(LinkedList<Course> c, String category, String str) {

        switch (category) {
            case "course name":
                if (str.equals("ascending")) {
                    c.sort(Comparator.comparing(Course::getCourseName));
                    System.out.println(courses);


                } else {
                    c.sort(Comparator.comparing(Course::getCourseName, Comparator.reverseOrder()));
                    System.out.println(c);

                }
                break;

            case "department":
                if (str.equals("ascending")) {
                    c.sort(Comparator.comparing(Course::getDepartment));
                    System.out.println(c);
                } else {
                    c.sort(Comparator.comparing(Course::getDepartment, Comparator.reverseOrder()));
                    System.out.println(c);
                }


                break;
            case "day":
                if (str.equals("ascending")) {
                    c.sort(Comparator.comparing(Course::getWeeklyMeeting));
                    System.out.println(c);
                } else {
                    c.sort(Comparator.comparing(Course::getWeeklyMeeting, Comparator.reverseOrder()));
                    System.out.println(c);
                }
                break;

            case "description":
                if (str.equals("ascending")) {
                    c.sort(Comparator.comparing(Course::getCourseDescription));
                    System.out.println(c);
                } else {
                    c.sort(Comparator.comparing(Course::getCourseDescription, Comparator.reverseOrder()));
                    System.out.println(c);
                }
                break;

            case "time":
                if (str.equals("ascending")) {
                    c.sort(Comparator.comparing(Course::getCourseStart));
                    System.out.println(c);
                } else {
                    c.sort(Comparator.comparing(Course::getCourseStart, Comparator.reverseOrder()));
                    System.out.println(c);
                }
                break;

            default:
                System.out.println("invalid");

        }

    }

}
