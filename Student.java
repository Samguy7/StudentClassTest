
/**
 *
 * @author sam
 */
public class Student extends Human {

    private String firstName;
    private String lastName;
    private String studentID;

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;

    }

    public String getStudentID() {
        return this.studentID;
    }

    public void printStudentInformation() {
        System.out.println("The student information:");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Student ID: " + this.studentID);
        if (this.canTalk) {
            System.out.println("Yes, this human can talk");
        } else {
            System.out.println("No, sorry this human cannot talk");
        }
    }
}
