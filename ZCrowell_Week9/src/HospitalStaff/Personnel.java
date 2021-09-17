package HospitalStaff;

public class Personnel {


    // variables
    private int staffCount;
    private String jobTitle;
    private String currentShift;
    private static int patientCount;

    //constructors
    public Personnel() {

    } // end Personnel()

    public Personnel(int count, String title, String shift) {
        staffCount = count;
        jobTitle = title;
        currentShift = shift;
    }

    // accessors
    public int getStaffCount() {
        return staffCount;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getCurrentShift() {
        return currentShift;
    }
    public int getPatientCount() {
        return patientCount;
    }

    // mutators
    public void setStaffCount(int count) {
        staffCount = count;
    }
    public void setJobTitle(String title) {
        jobTitle = title;
    }
    public void setCurrentShift(String shift) {
        currentShift = shift;
    }
    public static void setPatientCount(int pCount) {
        patientCount = pCount;
    }

    // toString() method
    public String toString() {
        return("Current number of " + jobTitle + " working: " + staffCount +
                "\nThe current shift is: " + currentShift);

    }











} // end class Personnel
