import java.util.Scanner;

public class a2_q19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        for (int row = 1; row <=n; row++) {
            if (row==1){
                for (int col = 1; col <= (n+1)/2; col++) {
                    System.out.print(" * ");
                }
                for (int col = 1; col <= ((n - 1) / 2) - 1; col++) {
                    System.out.print("   ");

                }
                System.out.print(" * ");
            }

            while(row>1&&row<=(n-1)/2) {
                for (int col = 1; col <= ((n - 1) / 2); col++) {
                    System.out.print("   ");

                }
                System.out.print(" * ");
                for (int col = 1; col <= ((n - 1) / 2) - 1; col++) {
                    System.out.print("   ");

                }
                System.out.print(" * ");
                break;
            }

            if (row==(n+1)/2){
                for (int col = 1; col <=n ; col++) {
                    System.out.print(" * ");

                }
            }

            while(row>(n+1)/2&&row<n){
                System.out.print(" * ");
                for (int col = 1; col <= (((n - 1) / 2)-1); col++) {
                    System.out.print("   ");

                }
                System.out.print(" * ");
                for (int col = 1; col <= ((n - 1) / 2) ; col++) {
                    System.out.print("   ");

                }
                break;
            }

            if (row==n){
                System.out.print(" * ");
                for (int col = 1; col <= ((n - 1) / 2) - 1; col++) {
                    System.out.print("   ");

                }
                for (int col = 1; col <= (n+1)/2; col++) {
                    System.out.print(" * ");
                }

            }
            System.out.println();
        }
    }
}

