/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_10.GradeBookApp;

import javafx.beans.property.SimpleStringProperty;

public class Student {

    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty course;
    private final SimpleStringProperty grade;

    /**
     * Default constructor for the Student class.
     * Initializes all properties to empty strings.
     */
    public Student(){
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.course = new SimpleStringProperty("");
        this.grade = new SimpleStringProperty("");
    }
    /**
     * Constructor for the Student class.
     * Initializes the students information with the provided values.
     *
     * @param firstName The student's first name.
     * @param lastName  The student's last name.
     * @param course   The course the student is enrolled in.
     * @param grade    The student's grade in the course.
     */
    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.course = new SimpleStringProperty(course);
        this.grade = new SimpleStringProperty(grade);
    }

    // Getter and Setter Methods
    public SimpleStringProperty getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);;
    }

    public SimpleStringProperty getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);;
    }

    public SimpleStringProperty getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course.set(course);;
    }

    public SimpleStringProperty getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade.set(grade);;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string containing the student's information.
     */
    @Override
    public String toString() {
        return "Student {firstName=" + firstName + ", lastName=" + lastName + ", course=" + course + ", grade=" + grade
                + "}";
    }
    

}
