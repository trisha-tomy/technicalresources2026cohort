import java.util.Scanner;

public class a2_q16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        int col,row;
        for (row = 1; row <n ; row++) {
            for (col = 1; col <=row ; col++) {
                System.out.print(" "+col+" ");
            }
            for (int space = 0; space <n-row ; space++) {
                System.out.print("   ");
            }
            for (int space = n-row-1; space>0 ; space--) {
                System.out.print("   ");
            }

            for (col = row; col >=1 ; col--) {
                System.out.print(" "+col+" ");
            }
            System.out.println();

        }
        if (row==n){
            for (col = 1; col <row ; col++) {
                System.out.print(" "+col+" ");
            }
            System.out.print(" "+row+" ");
            for (col = row-1; col >=1 ; col--) {
                System.out.print(" "+col+" ");
            }

        }

    }
}
