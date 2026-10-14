import java.util.Scanner;

/** @author pcorealva */

public class Eco {

    static void eco(int n) {
        if ( n > 0) {
            for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
            }

        } else {
            System.out.println("No sirven números negativos.");
        }

        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dale un valor a n: ");
        int n = sc.nextInt();
        eco(n);
        
        sc.close();
    }

}

    


