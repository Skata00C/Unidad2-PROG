package Ejemplos;

import java.util.Scanner;

public class EnquisaCursoEspacializacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Mostra menú
        System.out.println("ESTÁS INTERESAD@ EN HACER UN CURSO DE ESPECIALIZACIÓN?\n");
        System.out.println("==========================================================\n");
        System.out.println("1 Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2 Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3 Intelixencia artificial e big data");
        System.out.println("4. Ningun curso");
        System.out.println("0. Saír");
        
        System.out.print("\nEscribe una opción: ");
        int opción = sc.nextInt();

        while (opción != 0) {
            // Incrementar el contador correspondiente
            System.out.println("Gracias. Hemos registrado tu respuesta.");

            // Mostrar menú
            System.out.print("ESTÁS INTERESAD@ EN HACER UN CURSO DE ESPECIALIZACIÓN?");
            System.out.println("==========================================================\n");
            System.out.println("1 Ciberseguridade en contornos das tecnoloxías da información");
            System.out.println("2 Desenvolvemento de videoxogos e realidade virtual");
            System.out.println("3 Intelixencia artificial e big data");
            System.out.println("4. Ningun curso");
            System.out.println("0. Saír");

            System.out.print("Escribe una opción");
            opción = sc.nextInt();
        }

        sc.close();

        // Mostrar resultados de la encuesta
        //...
    }

}
