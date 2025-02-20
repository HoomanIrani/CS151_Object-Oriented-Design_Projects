/**
 * This class represents course information and implements Cloneable interface for deep coping.
 */

public class Course implements Cloneable {

    /**
     * Attributes of Course class.
     * @param courseName
     * @param courseDescription
     * @param department
     * @param courseStart
     * @param dayOfWeek
     */

    private String courseName;
    private String courseDescription;
    private String department;
    private String courseStart;
    private String dayOfWeek;

    /**
     * Parameterized constructor for Course class.
     * @param courseName
     * @param courseDescription
     * @param department
     * @param courseStart
     * @param dayOfWeek
     */
    public Course(String courseName, String courseDescription, String department,
                  String courseStart, String dayOfWeek) {

        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStart = courseStart;
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Getter methods for Course class attributes.
     */
    public String getCourseName() {

        return courseName;
    }

    public String getCourseDescription() {

        return courseDescription;
    }

    public String getDepartment() {

        return department;
    }

    public String getCourseStart() {

        return courseStart;
    }

    public String getDayOfWeek() {

        return dayOfWeek;
    }

    /**
     *Setter methods for course class attributes.
     */
    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {

        this.courseDescription = courseDescription;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setCourseStart(String courseStart) {

        this.courseStart = courseStart;
    }

    public void setDayOfWeek(String dayOfWeek) {

        this.dayOfWeek = dayOfWeek;
    }

    /**
     * clone method for coping.
     * @return super.clone();
     * @throws CloneNotSupportedException
     */
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    /**
     * toString method to sort and print data.
     * @return toString
     */
    @Override
    public String toString() {
        return  "Course Name = '" + courseName + '\'' +
                ", Course Description = '" + courseDescription + '\'' +
                ", Department = '" + department + '\'' +
                ", Course Start = '" + courseStart + '\'' +
                ", Day Of Week = '" + dayOfWeek + '\'' +
                '}';
    }
}
