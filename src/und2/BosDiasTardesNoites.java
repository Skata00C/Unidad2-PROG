import java.util.Scanner;

/** @author pcorealva */

public class BosDiasTardesNoites {
    public static void main(String[] args) {
        // Imput 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();

        sc.close();

        // Resultado
        if (hora >= 7 && hora <= 13) {
            System.out.println("Bos días");
        } else if (hora >= 14 && hora <= 20) {
            System.out.println("Boas tardes");
        } else if (hora >= 21 && hora <= 23 || hora >= 0 && hora <= 6) {
            System.out.println("Boas noites");
        } else {
            System.out.println("Hora no válida.");
        }
    }

}
