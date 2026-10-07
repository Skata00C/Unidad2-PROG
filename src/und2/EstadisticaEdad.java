import java.util.Scanner;

/** @autor pcorealva */

public class EstadisticaEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las edades (-1 para terminar el bucle): ");
        int edad = sc.nextInt();

        int suma = 0;
        int alumnos = 0;
        int mayoresEdad = 0;

        while (edad >= 0) {

            suma = suma + edad;
            alumnos++;

            if (edad >= 18) {
                mayoresEdad++;
            }

            edad = sc.nextInt();
        }

        if (alumnos > 0) {
            double media = (double) suma / alumnos;

            System.out.println("Suma de las edades: " + suma);
            System.out.printf("Media: %.2f%n" , media);
            System.out.println("Número de alumnos: " + alumnos);
            System.out.println("Mayores de edad: " + mayoresEdad);
        } else {
            System.out.println("No se han introducido edades.");
        }

        sc.close();
    }
}
    


