import java.util.Scanner;

/** @author pcorealva */

public class EdadMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce edades del alumno (-1 para terminal): ");

        int sumaEdades = 0;
        int edad = sc.nextInt();

        while (edad != -1) {
            // Cuerpo de bucle
            // Proceso
            sumaEdades = sumaEdades + edad;
            // Nueva lectura
            edad = sc.nextInt();
        }

        sc.close();

        System.out.println("Suma de las esdades: " + sumaEdades);
    }

}
