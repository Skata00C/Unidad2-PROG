import java.util.Scanner;

/** @author pcorealva */

public class DiaDeLaSemana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número del 1-7: ");
        int día = sc.nextInt();

        sc.close();

        switch (día) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("No esta dentro del rango de 1-7");
                break;
        }
    }

}
