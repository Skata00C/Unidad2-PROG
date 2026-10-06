import java.util.Scanner;

/** @author pcorealva */


public class FechaCorrecta {
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
            case 1:
                if (día <= 31) {
                    System.out.println("Mes: Enero");
                } else {
                    System.out.println("Enero no tiene más de 31 días.");
                }
                break;
            case 2:
                if (día <= 28) {
                    System.out.println("Mes: Febrero");
                } else {
                    System.out.println("Febrero no tiene más de 28 días.");
                }
                break;
            case 3:
                if (día <= 31) {
                    System.out.println("Mes: Marzo");
                } else {
                    System.out.println("Marzo no tiene más de 31 días.");
                }
                break;
            case 4:
                if (día <= 30) {
                    System.out.println("Mes: Abril");
                } else {
                    System.out.println("Abril no tiene más de 30 días.");
                }
                break;
            case 5:
                if (día <= 31) {
                    System.out.println("Mes: Mayo");
                } else {
                    System.out.println("Mayo no tiene más de 31 días.");
                }
                break;
            case 6:
                if (día <= 30) {
                    System.out.println("Mes: Junio");
                } else {
                    System.out.println("Junio no tiene más de 30 días.");
                }
                break;
            case 7:
                if (día <= 31) {
                    System.out.println("Mes: Julio");
                } else {
                    System.out.println("Julio no tiene más de 31 días.");
                }
                break;
            case 8:
                if (día <= 31) {
                    System.out.println("Mes: Agosto");
                } else {
                    System.out.println("Agosto no tiene más de 31 días.");
                }
                break;
            case 9:
                if (día <= 30) {
                    System.out.println("Mes: Septiembre");
                } else {
                    System.out.println("Septiembre no tiene más de 30 días.");
                }
                break;
            case 10:
                if (día <= 31) {
                    System.out.println("Mes: Octubre");
                } else {
                    System.out.println("Octubre no tiene más de 31 días.");
                }
                break;
            case 11:
                if (día <= 30) {
                    System.out.println("Mes: Noviembre");
                } else {
                    System.out.println("Noviembre no tiene más de 30 días.");
                }
                break;
            case 12:
                if (día <= 31) {
                    System.out.println("Mes: Diciembre");
                } else {
                    System.out.println("Diciembre no tiene más de 31 días.");
                }
                break;
            default:
                System.out.println("Solo exiten 12 ");
                break;
        }

        System.out.println("Año: " + año);
        
        
    }
}
