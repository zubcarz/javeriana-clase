import java.util.Scanner;
import jdk.dynalink.beans.StaticClass;

public class UiComponents {

    static void generalMenu() {

        Scanner scan = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Digite una opcion del menu");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Borrar Usuario");
            System.out.println("3. Crear una nota");
            System.out.println("4. Actualizar una nota");
            System.out.println("5. Borrar una nota");
            System.out.println("0. Exit Menu");
            System.out.println("Digite una opcion del menu: ");
            // Scanner scan2 = new Scanner(System.in);
            option = Integer.valueOf(scan.nextLine());

            switch (option) {
                case 1:
                    System.out.println("¿Ccual es su nombre? ");
                    String name = String.valueOf(scan.nextLine());
                    System.out.println("Porfavor digite su apellido ");
                    String lastName = String.valueOf(scan.nextLine());
                    
                    Alumnos alum = new Alumnos(name, lastName);
                    alum.showName();

                    break;
            }

        } while (option != 0);

    }

    static void showCreateMenu() {

    }

    static void showUpdateNotes() {

    }

    static void showDeleteNotes() {

    }

}
