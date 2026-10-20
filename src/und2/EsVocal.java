import java.util.Scanner;

// @autor pcorealva

public class EsVocal {
    static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i'
            || letra == 'o' || letra == 'u'
            || letra == 'A' || letra == 'E' || letra == 'I'
            || letra == 'O' || letra == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);

        System.out.println(esVocal(letra));

        sc.close();
    }
}


