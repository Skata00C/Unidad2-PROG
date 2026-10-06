import java.util.Scanner;

/** @author pcorealva */

public class UnDiaMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        sc.close();

        //cuántos días tiene el mes
        int diasMes;

        switch (mes) {
            case 2:
                diasMes = 28;
                break;
            case 4 , 6 , 9 , 11:
                diasMes = 30;
                break;
            default:
                diasMes = 31;
                break;
        }

        // Sumas un día
        dia++;

        // Si pasa de los días del mes
        if (dia > diasMes) {
            dia = 1;
            mes++;
        }

        // Si pasa dediciembre
        if (mes > 12) {
            mes = 1;
            anio++;
        }

        // Salida
        System.out.printf("El día siguiente es: %02d/%02d/%d%n", dia, mes, anio);
    }

}
