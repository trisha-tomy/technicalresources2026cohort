import java.util.Scanner;

public class a2_q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            if (row % 2 != 0) {
                int total_col = row > n ? 2 * n - row : row;
                int spaces = n - total_col;
                for (int space = 1; space <=spaces; space++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");

                while (row!=1&&row!=2*n-1) {
                    for (int col = 1; col <= total_col+(total_col-3); col++) {
                        System.out.print("   ");

                    }
                    System.out.print(" * ");
                    break;

                }

                System.out.println();

            }
        }
    }


}
