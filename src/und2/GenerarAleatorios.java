import java.util.Random;
import java.util.Scanner;

/** @author pcorealva */

public class GenerarAleatorios {
    public static void generarAleatorios(
            int cantidad, int minimo, int maximo) {

        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(
                    (int) ((long) maximo - minimo + 1)) + minimo;

            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int cantidad = sc.nextInt();

        System.out.print("Valor mínimo: ");
        int minimo = sc.nextInt();

        System.out.print("Valor máximo: ");
        int maximo = sc.nextInt();

        if (cantidad > 0 && minimo <= maximo
                && (long) maximo - minimo < Integer.MAX_VALUE) {
            generarAleatorios(cantidad, minimo, maximo);
        } else {
            System.out.println("Datos no válidos.");
        }

        sc.close();
    }
}
