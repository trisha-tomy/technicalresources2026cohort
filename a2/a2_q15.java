import java.util.Scanner;

public class a2_q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n ; row++) {
            int total_col = row > n ? 2 * n - row : row;
            for (int space = 0; space < n-total_col; space++) {
                System.out.print("   ");
            }
            for (int col = total_col; col <=2*total_col-1; col++) {
                System.out.print(" "+col+" ");
            }
            for (int col = 2*total_col-1-1; col >=total_col ; col--) {
                System.out.print(" "+ col+ " ");
            }             
            System.out.println();
        }
    }


}
