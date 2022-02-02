/**
 * Student class which asks for students information and print out class schedule.
 */
public class Student implements Cloneable {

    /**
     * Attribute of Student class:
     * @param firstName
     * @param lastName
     * @param age
     * @param gpa
     * @param major
     * @param department
     * @param course
     */
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private Course course;

    /**
     * Parameterized constructor for Student class.
     * @param firstName
     * @param lastName
     * @param age
     * @param gpa
     * @param major
     * @param department
     * @param course
     */
    public Student (String firstName, String lastName, int age,
                    double gpa, String major, String department, Course course) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    /**
     * Getter methods for Course class attributes.
     */
    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return age;
    }

    public double getGpa() {

        return gpa;
    }

    public String getMajor() {

        return major;
    }

    public String getDepartment() {

        return department;
    }

    public Course getCourse() {

        return course;
    }


    /**
     *Setter methods for Student class attributes.
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setMajor(String major) {

        this.major = major;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setCourse(String courseName, String courseDescription, String department,
                          String courseStart, String dayOfWeek) {

        this.course.setCourseName(courseName);
        this.course.setCourseDescription(courseDescription);
        this.course.setDepartment(department);
        this.course.setCourseStart(courseStart);
        this.course.setDayOfWeek(dayOfWeek);
    }

    /**
     * clone method for coping.
     * @return super.clone();
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }

    /**
     * toString method to sort and print data.
     * @return toString
     */
    @Override
    public String toString() {
        return "\nStudent{ " +
                "First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Age = " + age +
                ", GPA = " + gpa +
                ", Major = '" + major + '\'' +
                ", Department = '" + department + '\'' +
                ", \nCourse Schedule{ " + course +
                '}';
    }

    /**
     * printInfo method to print out class schedule.
     */
    public void printInfo() {

        System.out.println(toString());
    }

}
