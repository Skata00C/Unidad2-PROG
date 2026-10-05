import java.util.Scanner;

/** @author pcorealva  */

public class EcuacionGrado2 {
    public static void main(String[] args) {
        // Imput
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();
        
        sc.close();

        double discriminante = b * b - 4 * a * c;

        // Resultado
        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Solución x1: " + x1);
            System.out.println("Solución x2: " + x2);

        } else if (discriminante == 0) {

            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única solución: " + x);
        } else {

            System.out.println("No existen soluciones reales.");
        }
    }

}
