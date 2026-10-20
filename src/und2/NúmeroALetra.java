import java.util.Scanner;

/** @author pcorealva */

public class NúmeroALetra {
     public static String numeroALetra(int n) {
        String[] unidades = {
            "", "uno", "dos", "tres", "cuatro", "cinco",
            "seis", "siete", "ocho", "nueve"
        };

        String[] especiales = {
            "diez", "once", "doce", "trece", "catorce",
            "quince", "dieciséis", "diecisiete",
            "dieciocho", "diecinueve", "veinte",
            "veintiuno", "veintidós", "veintitrés",
            "veinticuatro", "veinticinco", "veintiséis",
            "veintisiete", "veintiocho", "veintinueve"
        };

        String[] decenas = {
            "", "", "", "treinta", "cuarenta",
            "cincuenta", "sesenta", "setenta",
            "ochenta", "noventa"
        };

        if (n < 1 || n > 99) {
            return "Número fuera de rango";
        }

        if (n < 10) {
            return unidades[n];
        }

        if (n <= 29) {
            return especiales[n - 10];
        }

        int d = n / 10;
        int u = n % 10;

        if (u == 0) {
            return decenas[d];
        }

        return decenas[d] + " y " + unidades[u];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 99: ");
        int n = sc.nextInt();

        System.out.println(numeroALetra(n));

        sc.close();
    }
}
