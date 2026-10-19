import java.util.Scanner;

/** @author pcorealva */

public class Triángulo {
     public static void triangulo(int n) {
        for (int i = 1; i <= n; i++) {

            for (int e = 1; e <= n - i; e++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int n = sc.nextInt();

        if (n > 0) {
            triangulo(n);
        } else {
            System.out.println("La altura debe ser positiva.");
        }

        sc.close();
    }
}
