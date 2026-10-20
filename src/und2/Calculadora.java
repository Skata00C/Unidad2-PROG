/** @author pcorealva */

public class Calculadora {
    /**
     * 
     * @param operando1
     * @param operando2
     * @param operación sumar(1), restar(2), multiplicar(3) o dividir(4)
     * @return Resultado
     */
    public static double calculadora(double operando1, double operando2, int operación) {
        double resultado;

        switch (operación) {
            case 1: resultado = operando1 + operando2; break;
            case 2: resultado = operando1 - operando2; break; 
            case 3: resultado = operando1 * operando2; break;
            case 4: resultado = operando1 / operando2; break;
            default: resultado = 0;
        }

        return resultado; 
    }

    public static void main(String[] args) {
        
        System.out.println(calculadora(2, 3, 1)); // 5
        System.out.println(calculadora(2, 3, 2)); // -1
        System.out.println(calculadora(2, 3, 3)); // 6
        System.out.println(calculadora(2, 3, 4)); // 0
        System.out.println(calculadora(2, 3, 5)); // 0
        System.out.println(calculadora(2, 0, 4)); // Infinity

    }
}
