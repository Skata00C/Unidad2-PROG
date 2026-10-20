import java.util.Scanner;

/** @author pcorealva */

public class Maximo {

    static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        int resultado = maximo(a, b);

        System.out.println("El número máximo es: " + resultado);

        sc.close();
    }
}