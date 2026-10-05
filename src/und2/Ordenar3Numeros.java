import java.util.Scanner;

/** @author pcorealva */

public class Ordenar3Numeros {
    public static void main(String[] args) {
        // Imput
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        sc.close();

        // Resultado
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("Resultado mayor a menor: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Resultado mayor a menor: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("Resultado mayor a menor: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Resultado mayor a menor: " + num2 + " " + num3 + " " + num1);
            }
        } else {

            if (num1 >= num2) {
                System.out.println("Resultado mayor a menor: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Resultado mayor a menor: " + num3 + " " + num2 + " " + num1);
            }
        }

    }

}
