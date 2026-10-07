 import java.util.Scanner;

/** @author pcorealva */

public class EdadMaximaMinima {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Valorés de la edad min y máxima 
        int max = Integer.MIN_VALUE;    // Uso max con MIN_VALUE ya que de esta manera el valor introduciodo va a obligarse a ser mayor que el max 
        int min = Integer.MAX_VALUE;    // Uso min con MAX_VALUE ya que de esta manera el valor introducido va a obligarse a ser menor que el min

        System.out.print("Escribe las edades del alumnado (-1 para terminar): ");
        int edad = sc.nextInt();

        while (edad != -1) {
            if (edad > max) {
                max = edad;
            }
            if (edad < min) {
                min = edad;
            }

            edad = sc.nextInt();
        }

        sc.close();

        System.out.println("Edad máxima: " + max);
        System.out.println("Edad mínima: " + min);
            
        }
 }


