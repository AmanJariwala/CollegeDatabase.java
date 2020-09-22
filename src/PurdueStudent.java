import java.util.ArrayList;

/**
 * The class for PurdueStudent.
 *
 * @author Aman Jariwala
 * @version April 03, 2020
 */
public class PurdueStudent extends CollegeStudent {
    private static ArrayList<String> idNums = new ArrayList<String>();

    public PurdueStudent(int age, String firstName, String lastName,
                         String stateOfResidency, String major, String housing) {
        super(age, firstName, lastName, stateOfResidency, major, housing);
    }

    public PurdueStudent(String id) {
        super(id);
    }

    public PurdueStudent() {

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
        if (stateOfResidency.equals("Indiana")) {
            this.tuition = CollegeConstants.PURDUE_UNIVERSITY_IN_STATE_TUITION;
        } else {
            this.tuition = CollegeConstants.PURDUE_UNIVERSITY_OUT_OF_STATE_TUITION;
        }
    }

    public String getMajor() {
        return major;
    }

    public String getHousing() {
        return housing;
    }

    public String getState() {
        return "Indiana";
    }

    public String generateID() {
        boolean exists = false;
        do {
            long rand = (long) Math.floor(Math.random() * 9000_000_000L) + 1000_000_000L;
            this.id = "" + rand;
            String[] idArray = new String[10];
            for (int i = 0; i < id.length(); i++) {
                idArray[i] = this.id.charAt(i) + "";
                if (i == 1) {
                    idArray[i] = "1";
                } else if (i == 2) {
                    idArray[i] = "3";
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
