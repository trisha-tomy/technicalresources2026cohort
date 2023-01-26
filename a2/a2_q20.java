import java.util.Scanner;

public class a2_q20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        int space_thirdrow= (n-3)/2;
        int spaces= space_thirdrow;
        int space_rows= (n-1)/2;
        int row_space_rows=1;
        for (int row = 1; row <= n; row++) {
            while((row>=1&&row<(n+1)/2)||row==n) {
                System.out.print(" * ");
                for (int col = 1; col <= n-2; col++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
                break;
            }

            while (row>=(n+1)/2&&row<n){
                System.out.print(" * ");
                for (int space = spaces; space >= 1 ; space--) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
                if (row>(n+1)/2&&row<n){
                    while(row_space_rows<= 2*space_rows){
                        if (row_space_rows %2 !=0){
                            for (int col = 1; col <=row_space_rows ; col++) {
                                System.out.print("   ");

                            }
                        }
                        break;
                    }
                    row_space_rows+=2;
                    System.out.print(" * ");


                }

                for (int space = spaces; space >= 1 ; space--) {
                    System.out.print("   ");
                }
                System.out.print(" * ");

                spaces--;
                break;
            }

            System.out.println();
        }
    }
}

