public abstract class CollegeStudent {
    protected double tuition;
    protected int age;
    protected String firstName;
    protected String lastName;
    protected String stateOfResidency;
    protected String major;
    protected String housing;
    protected String id;

    public CollegeStudent(int age, String firstName, String lastName, String stateOfResidency,
                          String major, String housing) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.stateOfResidency = stateOfResidency;
        this.major = major;
        this.housing = housing;
    }

    public CollegeStudent(String id) {
        this.id = id;
    }
    public CollegeStudent(){

    }

    public abstract double getTuition();
    public abstract int getStudentAge();
    public abstract String getStudentFirstName();
    public abstract String getStudentLastName();
    public abstract String getStateOfResidence();
    public abstract String getFullName();
    public abstract void calculateTuition();
    public abstract String getMajor();
    public abstract String getHousing();
    public abstract String getState();
    public abstract String generateID();
    public abstract String getID();

}
