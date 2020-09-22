import java.util.ArrayList;
import java.util.Random;

/**
 * The class for OhioStateStudent.
 *
 * @author Aman Jariwala
 * @version April 03, 2020
 */
public class OhioStateStudent extends CollegeStudent {
    private static ArrayList<String> idNums = new ArrayList<String>();

    public OhioStateStudent(int age, String firstName, String lastName,
                            String stateOfResidency, String major, String housing) {
        super(age, firstName, lastName, stateOfResidency, major, housing);
    }

    public OhioStateStudent(String id) {
        super(id);
    }

    public OhioStateStudent() {

    }

    public double getTuition() {
        return this.tuition;
    }

    public int getStudentAge() {
        return age;
    }

    public String getStudentFirstName() {
        return this.firstName;
    }

    public String getStudentLastName() {
        return this.lastName;
    }

    public String getStateOfResidence() {
        return stateOfResidency;
    }

    public String getFullName() {
        return getStudentFirstName() + " " + getStudentLastName();
    }

    public void calculateTuition() {
        if (stateOfResidency.equals("Ohio")) {
            this.tuition = CollegeConstants.OHIO_STATE_UNIVERSITY_IN_STATE_TUITION;
        } else {
            this.tuition = CollegeConstants.OHIO_STATE_UNIVERSITY_OUT_OF_STATE_TUITION;
        }
    }

    public String getMajor() {
        return major;
    }

    public String getHousing() {
        return housing;
    }

    public String getState() {
        return "Ohio";
    }

    public String generateID() {
        boolean exists = false;
        do {
            long rand = (long) Math.floor(Math.random() * 9000_000_000L) + 1000_000_000L;
            this.id = "" + rand;
            String[] idArray = new String[10];
            String[] choose = {"0", "1"};
            Random ran = new Random();
            for (int i = 0; i < id.length(); i++) {
                idArray[i] = this.id.charAt(i) + "";
                if (i % 2 != 0) {
                    idArray[i] = choose[ran.nextInt(2)];
                }

            }
            this.id = "";
            for (int i = 0; i < idArray.length; i++) {
                this.id = this.id + idArray[i];
            }

            if (idNums.size() == 0) {
                break;
            } else {
                for (int i = 0; i < idNums.size(); i++) {
                    if (this.id.equals(idNums.get(i))) {
                        exists = true;
                        break;
                    }
                }
            }
        } while (exists == true);

        idNums.add(this.id);
        String result = String.join("", idNums);
        return result;

    }

    public String getID() {
        return this.id;
    }
}
