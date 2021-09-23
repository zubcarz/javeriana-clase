import java.util.Scanner;
import javax.print.Doc;

public class App {

    // Create
    private double pi = 3.1416;
    private Alumnos alumn2 = new Alumnos("Lorena3", "Soto3");

    // Start
    public static void main(String[] args) throws Exception {
        Alumnos alumn1 = new Alumnos("Carlos", "Soto1");
        alumn1.name =  alumn1.name + " agregado";
        alumn1.addTwo();

        // alumn1.showId();

   
        // UiComponents.generalMenu();
        // UiComponents.generalMenu();

       
        // alumn2.showId();

      
        // alumn3.showId();

        // Alumnos porche = new Alumnos();
        // alumn4.showId();

        // Scanner scan = new Scanner(System.in);
        // int inOption = Integer.valueOf(scan.nextLine());

        // System.out.println("In -> " + inOption);

        // Scanner scan2 = new Scanner(System.in);
        // String value = String.valueOf(scan.nextLine());
        // System.out.println("In -> " + value);

        // if (args.length > 0) {
            for (int i = 0; i < 30000; i++) {
                System.out.println("In -> ");
            }
        // }

    }

    // protected void finalize()
}
