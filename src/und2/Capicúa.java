import java.util.Scanner;

/** @author pcorealva */

public class Capicúa {
    public static boolean esCapicua(long n) {
        if (n < 0) {
            return false;
        }

        long original = n;
        long invertido = 0;

        while (n > 0) {
            long digito = n % 10;
            invertido = invertido * 10 + digito;
            n = n / 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long n = sc.nextLong();

        System.out.println(esCapicua(n)
                ? "Es capicúa"
                : "No es capicúa");

        sc.close();
    }

}
