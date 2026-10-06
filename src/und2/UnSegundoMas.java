import java.util.Scanner;

/** @author pcorealva */

public class UnSegundoMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        sc.close();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }

        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }
    

}
