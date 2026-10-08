import java.util.Random;
import java.util.Scanner;

/** @author pcorealva */

public class NúmeroSecreto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int num1 = 0;
        final int num2 = 100;

        Random rng = new Random();

        int numRandom = (rng.nextInt(num1, num2) + 1 );

        System.out.print("Empieza el juego con tu primer número: ");
        int numTeclado = sc.nextInt();

        while (numTeclado != numRandom) {
            if (numTeclado < numRandom) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
            numTeclado = sc.nextInt();
        }

        System.out.println("Siiii!!, tu número secreto era el: " + numTeclado);
    }

}
