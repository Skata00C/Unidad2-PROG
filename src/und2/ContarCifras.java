import java.util.Scanner;

/** @author pcorealva */

public class ContarCifras {
    public static void main(String[] args) {
        // Imput
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 99999: ");
        int numero = sc.nextInt();

        sc.close();

        // Versión negativa
        numero = Math.abs(numero);

        

        // Resultado
        if (numero >= 0 && numero <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.println("El número tiene 4 cifras.");
        } else if (numero >= 10000 && numero <= 99999) {
            System.out.println("El número tiene 5 cifras.");
        } else {
            System.out.println("El número no está dentro del rango.");
        }
    }

}
