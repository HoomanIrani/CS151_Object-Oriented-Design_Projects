/**
 * @author Houman Irani
 * @version 1.00
 * @Since 03-21-2021
 *
 *<p>
 *     This Application includes a Course class as an instance of Student class.
 *     This Application add, remove and set courses for students.
 *</p>
 */

/**
 * Course class as an instance of Student class.
 */
public class Course {

    /**
     * Attributes of Course class including:
     * @param courseName
     * @param courseDescription
     * @param department
     * @param courseStart
     * @param weeklyMeeting
     */
    private String courseName;
    private String courseDescription;
    private String department;
    private String courseStart;
    private String weeklyMeeting;


    /**
     * Parameterized constructor for Course class.
     * @param courseName
     * @param courseDescription
     * @param department
     * @param courseStart
     * @param weeklyMeeting
     */
    public Course(String courseName, String courseDescription,
                  String department, String courseStart, String weeklyMeeting){


        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStart = courseStart;
        this.weeklyMeeting = weeklyMeeting;
    }

    /**
     *Getter methods for attributes of class.
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

    public String getWeeklyMeeting() {

        return weeklyMeeting;
    }

    /**
     *Setter methods for attributes of Course class.
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

    public void setWeeklyMeeting(String weeklyMeeting) {

        this.weeklyMeeting = weeklyMeeting;
    }

    /**
     * toString method for sorting and printing out the results.
     * @return toString()
     */
    @Override
    public String toString() {
        return "Course: " +
                "Course Name = " + courseName +
                ", Course Description = " + courseDescription +
                ", Department = " + department +
                ", Course Start on = " + courseStart +
                ", weekly Meeting = " + weeklyMeeting +
                '}';
    }
}
