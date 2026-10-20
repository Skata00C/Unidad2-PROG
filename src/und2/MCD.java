/** @author pcorealva */

public class MCD {
    public static int mcd(int a, int b) {
        if (a == 0) {
            return Math.abs(b);
        }

        if (b == 0) {
            return Math.abs(a);
        }

        if (a >= b) {
            return mcd(a - b, b);
        } else {
            return mcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        System.out.println(mcd(12, 8));
    }
}
