import java.util.Scanner;

/** @author pcorealva */

public class MayorOIguales {
    public static void main(String[] args) {
        // Imput
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = sc.nextInt();
        sc.close();

        // Resultado
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales");
        }

    }

}
