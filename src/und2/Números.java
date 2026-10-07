import java.util.Scanner;

/** @author pcorealva */

public class Números {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número (0 para terminar el bucle): ");
    int num = sc.nextInt();

    while (num != 0)    {
            if (num % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            if (num > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("No es positivo");
            }

            System.out.println("Su cuadrado es: " + (Math.pow(num, 2)));

            System.out.println("Introduce otro número (0 para terminar):");
            num = sc.nextInt();
        }

        sc.close();
    }

    
    
}
