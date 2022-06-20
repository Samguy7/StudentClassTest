
/**
 *
 * @author sam
 */
public class StudentClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        s1.setFirstName("Sam");
        s1.setLastName("Guy");
        s1.setStudentID("8457095685");
        s1.setcanTalk(true);
        System.out.println(s1.getcanTalk());
        s1.printStudentInformation();
    }

}
