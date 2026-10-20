import java.util.Scanner;

/** @author pcorealva */

public class Dígitos {
    public static void mostrarDigitos(long n) {
        String numero = Long.toString(n);
        if (numero.startsWith("-")) {
            numero = numero.substring(1);
        }

        for (int i = 0; i < numero.length(); i++) {
            System.out.println(numero.charAt(i));
        }
    }

    public static void mostrarAlReves(long n) {
        String numero = Long.toString(n);
        if (numero.startsWith("-")) {
            numero = numero.substring(1);
        }

        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.println(numero.charAt(i));
        }
    }

    public static int numeroDigitos(long n) {
        return Long.toString(n).replace("-", "").length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long n = sc.nextLong();

        System.out.println("Dígitos:");
        mostrarDigitos(n);

        System.out.println("Al revés:");
        mostrarAlReves(n);

        System.out.println("Número de cifras: " + numeroDigitos(n));

        sc.close();
    }
}
