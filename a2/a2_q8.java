import java.util.Scanner;

public class a2_q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("   ");
            }
            System.out.print(" * ");
            System.out.println();
        }
    }
}
