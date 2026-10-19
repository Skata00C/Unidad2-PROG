import java.util.Scanner;

/** @author pcorealva */

public class TriánguloDePascal {
    public static void trianguloPascal(int filas) {
        for (int i = 0; i < filas; i++) {
            long valor = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        if (filas > 0 && filas <= 67) {
            trianguloPascal(filas);
        } else {
            System.out.println("Introduce entre 1 y 67 filas.");
        }

        sc.close();
    }

}
