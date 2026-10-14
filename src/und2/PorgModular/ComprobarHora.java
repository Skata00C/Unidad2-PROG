package PorgModular;

import java.util.Scanner;

import javax.swing.JOptionPane;

/** @author pcorealva */

public class ComprobarHora {
    static void comprobarHora(int hora, int minutos, int segundos) {

        boolean esHoraCorrecta = !(hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59);
        System.out.println(esHoraCorrecta);
    }

    static boolean esHoraCorrecta(int h, int m, int s) {

        return h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 59;
    }

    public static void main(String[] args) {
        
        comprobarHora(0, 0, 0);
        comprobarHora(-1, 0, 0);
        comprobarHora(0, 60, 0);
        comprobarHora(0, 0, 60);

        System.out.println(esHoraCorrecta(23, 59, 59));
        JOptionPane.showMessageDialog(null, "esHoraCorrecta" + esHoraCorrecta(23, 59, 59));
    }

}
