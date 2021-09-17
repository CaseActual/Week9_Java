

package HospitalStaff;

public class Main {
    public static void main(String[] args) {

        // create instance of Personnel class and populate it
        Personnel currentStaff = new Personnel(17, "Cardiologists", "3rd Shift");

        // add number of patients
        Personnel.setPatientCount(65);

        // print methods
        System.out.println(currentStaff.toString());
        System.out.println("There are currently " + currentStaff.getPatientCount() + " patients in this unit.");

    } // end main()
} // end class Main
