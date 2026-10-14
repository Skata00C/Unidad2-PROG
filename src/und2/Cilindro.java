import java.util.Scanner;

/** @author pcorealva */

public class Cilindro {
    static double cilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();

        double volumen = cilindro(radio, altura);

        System.out.println("El volumen del cilindro es: " + volumen);

        sc.close();
    }

}
