import java.util.Scanner;
import javax.print.Doc;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;

public class App extends JComponent {

    // Create
    // private double pi = 3.1416;
    // private Alumnos alumn2 = new Alumnos("Lorena3", "Soto3");
    static Circulo circulo = new Circulo(200);
    static int WIDTH_WINDOWS = 900;

    // Start
    public static void main(String[] args) throws Exception {
        // Circulo circulo0 = new Circulo();

        System.out.println("*****************************");
        System.out.println("*****************************");
        Circulo circulo2 = new Circulo(4);

        double diferenciaCircunferencia = circulo.diff(circulo2);
        System.out.println("Diff Circunferencia = " + diferenciaCircunferencia);

        double diferenciaCircunferencia2 = circulo2.diff(circulo);
        System.out.println("Diff Circunferencia = " + diferenciaCircunferencia2);

        double[] coord = circulo.coordenadas(2 * Math.PI);
        System.out.println("x = " + coord[0]);
        System.out.println("y = " + coord[1]);

        // Create panel
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window.getContentPane().setBackground(Color.BLUE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setBounds(0, 0, WIDTH_WINDOWS, WIDTH_WINDOWS);

        // add paint
        window.getContentPane().add(new App());
        window.setVisible(true);

        // A
        // double area = circulo.getArea();
        // System.out.println("Area = " + area);

        // // B
        // double circunferencia = circulo.circunferencia;
        // System.out.println("Circunferencia = " + circunferencia);

        // // C
        // circulo.printCirculo();

        // // D
        // circulo.printCirculoInt();

        // Alumnos alumn1 = new Alumnos("Carlos", "Soto1");
        // alumn1.name = alumn1.name + " agregado";
        // alumn1.addTwo();

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
        // for (int i = 0; i < 30000; i++) {
        // System.out.println("In -> ");
        // }
        // // }

    }

    public void paint(Graphics g) {

        // g.setColor(Color.blue);
        // g.drawLine(0, 0, 200, 200);
        // g.drawLine(0, 0, 400, 200);

        // g.setColor(Color.red);
        // g.drawLine(0 + WIDTH_WINDOWS / 2, 0 + WIDTH_WINDOWS / 2, 200 + WIDTH_WINDOWS
        // / 2, 200 + WIDTH_WINDOWS / 2);
        // g.drawLine(0 + WIDTH_WINDOWS / 2, 0 + WIDTH_WINDOWS / 2, 400 + WIDTH_WINDOWS
        // / 2, 200 + WIDTH_WINDOWS / 2);

        // move to center
        int ceroPosition = WIDTH_WINDOWS / 2;
        g.setColor(Color.black);
        int maxAngle = 1000;

        // // Draw lines
        // for (int i = 0; i < maxAngle; i++) {
        // double[] coord = circulo.coordenadas(i);
        // g.drawLine(0 + ceroPosition, 0 + ceroPosition, (int) coord[0] + ceroPosition,
        // (int) coord[1] + ceroPosition);
        // }

        //Draw rare
        for (int i = 0; i < maxAngle; i++) {
            double[] coord = circulo.coordenadas(i);


            System.out.println("incial x" + ((int) coord[0] + ceroPosition));
            
            System.out.println("incial y" + ((int) coord[1] + ceroPosition));
            
            System.out.println("incial Widht" + ((int) coord[0] + ceroPosition));
            
            System.out.println("incial Height" + ((int) coord[1] + ceroPosition));

            g.drawOval((int) coord[0] + ceroPosition, (int) coord[1] + ceroPosition, (int) coord[0] + ceroPosition,
                    (int) coord[1] + ceroPosition);
        }

        // // Draw simulate points
        // g.setColor(Color.red);
        // for (int i = 0; i < maxAngle; i++) {
        // double[] coord = circulo.coordenadas(i);
        // g.drawLine((int) coord[0] + ceroPosition, (int) coord[1] + ceroPosition,
        // (int) coord[0] + ceroPosition,
        // (int) coord[1] + ceroPosition);
        // }

        // g.drawOval((int) (2 * ceroPosition - circulo.dimaetro) / 2, (int) (2 *
        // ceroPosition - circulo.dimaetro) / 2,
        // (int) circulo.dimaetro, (int) circulo.dimaetro);
    }

    // protected void finalize()
}
