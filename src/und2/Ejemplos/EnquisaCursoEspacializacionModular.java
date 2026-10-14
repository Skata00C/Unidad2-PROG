package Ejemplos;

import java.util.Scanner;

public class EnquisaCursoEspacializacionModular {

    public static void mostrarMenu() {
        System.out.println("ESTÁS INTERESAD@ EN HACER UN CURSO DE ESPECIALIZACIÓN?\n");
        System.out.println("==========================================================\n");
        System.out.println("1 Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2 Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3 Intelixencia artificial e big data");
        System.out.println("4. Ningun curso");
        System.out.println("5. Desenvolvemento de Aplicacións en Linguaxe Python");
        System.out.println("0. Saír");
    }

    public static int pedirOpción() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEscribe una opción: ");
        return sc.nextInt();

    }
    public static void main(String[] args) {
        
        mostrarMenu();
        
        int opción = pedirOpción();

        while (opción != 0) {
            // Incrementar el contador correspondiente
            System.out.println("Gracias. Hemos registrado tu respuesta.");

            mostrarMenu();

            opción = pedirOpción();
        }


        // Mostrar resultados de la encuesta
        //...
    }

}
