import java.util.Scanner;

/** @author pcorealva */

public class NotaEnTexto {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe una nota con un número entero entre 1-10: ");
    int nota = sc.nextInt();

    sc.close();

    switch (nota) {
        case 1, 2, 3, 4:
            System.out.println("Tu nota es un insuficiente");
            break;
        case 5:
            System.out.println("Tu nota es un suficiente");
            break;
        case 6:
            System.out.println("Tu nota es un bien");
            break;
        case 7, 8:
            System.out.println("Tu nota es un notable");
            break;
        default:
            System.out.println("Tu nota es un sobresaliente");
            break;
    }
 }
}
