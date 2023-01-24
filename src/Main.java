
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doctor myDoctor = new Doctor("Catalina", "Doctora");
         //myDoctor.name= sc.next();
        //myDoctor.speciality = sc.next();
        myDoctor.getName();
        myDoctor.getId();

        Doctor doctorTwo = new Doctor("Sebastian", "Ingeniero");

        doctorTwo.getId();
        doctorTwo.getName();
       // UIMenu.showMenu();

        Patient patient = new Patient("Seba","juan.londono@udea.edu.co");

        patient.weight = 60.5;
        patient.heght = 1.80;
        System.out.println(patient.heght);
    }
}
