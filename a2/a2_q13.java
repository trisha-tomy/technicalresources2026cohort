import java.util.Scanner;

public class a2_q13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        int num_out=1;
        for (int row = 0; row <= n; row++) {
            for(int col = 0; col <= row; col++) {
                if (col == 0 || row == 0)
                    num_out = 1;
                else
                    num_out = num_out * (row - col + 1) / col;

                System.out.print(num_out+" ");
            }

            System.out.println();
        }
    }
}

