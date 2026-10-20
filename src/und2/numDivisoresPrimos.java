import java.util.Scanner;

public class numDivisoresPrimos {
    static int numDivisoresPrimos1(int n) {
        int contador = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }

    static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.println("Número de divisores primos: "
                + numDivisoresPrimos1(n));

        sc.close();
    }
}
