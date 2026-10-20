 /** @author pcorealva */

public class potencia {
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1;

        for (int i = 0; i < n; i++) {
            resultado *= a;
        }

        return resultado;
    }

    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * potenciaRecursiva(a, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2, 3));
        System.out.println(potenciaRecursiva(2, 3));
    }
}
