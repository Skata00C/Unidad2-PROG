import java.util.Scanner;

/** @author pcorealva */

public class ArbolMasAlto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String etiqueta;
        int altura;

        String arbolMasAlto = "";
        int alturaMaxima = -1;

        System.out.print("Introduce el nombre del árbol: ");
        etiqueta = sc.nextLine();

        System.out.print("Introduce su altura (-1 para terminar): ");
        altura = sc.nextInt();
        sc.nextLine();

        while (altura != -1) {

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                arbolMasAlto = etiqueta;
            }

            System.out.print("Introduce el nombre del árbol: ");
            etiqueta = sc.nextLine();

            System.out.print("Introduce su altura (-1 para terminar): ");
            altura = sc.nextInt();
            sc.nextLine();
        }

        sc.close();

        System.out.println("El árbol más alto es: " + arbolMasAlto);
        System.out.println("Su altura es: " + alturaMaxima + " cm");


    }

}
