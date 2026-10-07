import java.util.Scanner;

/** @author pcorealva */

public class EntradasConcierto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el número del aforo total: ");
        int aforo = sc.nextInt();

        System.out.print("Escribe el precio de la entrada: ");
        double precio = sc.nextDouble();

        System.out.print("Escribe el número de entradas vendidas: ");
        int entradas = sc.nextInt();

        sc.close();

        double noSuperaEl20 = aforo * 0.20;

        double noSuperaEl50 = aforo * 0.50;


        if (entradas <= noSuperaEl20) {

            System.out.println("========================");
            System.out.println("Las ventas no superan el 20%." + "\n" + "El concierto se cancela.");

        }   else if (entradas <= noSuperaEl50) {

            System.out.println("========================");
            System.out.println("No supera el 50%. \n" + "Se aplicará a las entradas un descuento del 25%.");
            precio = precio - (precio * 0.25);
            System.out.println("El precio quedará reduciado a: " + precio );
            System.out.println("Aforo total: " + aforo + "\n" + "Precio de las entradas: " + precio + "\n" + "Entradas vendidas: " + entradas );
            double resultado = (entradas * precio);
            System.out.println("Dinero total recaudado por el concierto: " + resultado + " euros.");

        }  else {

            System.out.println("========================");
            System.out.println("Aforo total: " + aforo + "\n" + "Precio de las entradas: " + precio + "\n" + "Entradas vendidas: " + entradas );
            double resultado = (entradas * precio);
            System.out.printf("Dinero total recaudado por el concierto: " + resultado + " euros.");
        } 
        
        

        
    }
            
        
    

}
