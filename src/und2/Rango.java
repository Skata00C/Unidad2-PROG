import java.util.Scanner;

/** @author pcorealva */

public class Rango {
    static void rango(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el punto a: ");
        int a = sc.nextInt();

        System.out.print("Escribe el punto b: ");
        int b = sc.nextInt();

        rango(a, b);

        sc.close();
    }

}
