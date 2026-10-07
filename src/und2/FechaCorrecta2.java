import java.util.Scanner;

/** @author pcorealva */


public class FechaCorrecta2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el día: ");
        int día = sc.nextInt();

        System.out.print("Escribe el número del mes: ");
        int mes = sc.nextInt();

        System.out.print("Escribe el año: ");
        int año = sc.nextInt();

        sc.close();

        System.out.println("Día: " + día);

        switch (mes) {
            case 1 , 3 , 5 , 7 , 8 , 10 , 12:
                if (día <= 31) {
                    System.out.println("mes: " + mes);
                } else {
                    System.out.println("Es mes tiene más de 31 días.");
                }
                break;
            case 2:
                if (día <= 28) {
                    System.out.println("mes: " + mes);
                } else {
                    System.out.println("Febrero no tiene más de 28 días.");
                }
                break;
            case 4 , 6 , 9 , 11:
                if (día <= 30) {
                    System.out.println("mes: " + mes);
                } else {
                    System.out.println("Es mes no tiene más de 30 días.");
                }
                break;
            default:
                System.out.println("Solo exiten 12 ");
                break;
        }

        System.out.println("Año: " + año);
    }
}