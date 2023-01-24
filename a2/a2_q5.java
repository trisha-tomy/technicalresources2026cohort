import java.util.Scanner;

public class a2_q5 {
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
                for (int space = 0; space < spaces; space++) {
                    System.out.print(" ");
                }

                for (int col = 1; col <= total_col; col++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
    }
}
