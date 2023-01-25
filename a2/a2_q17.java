import java.util.Scanner;

public class a2_q17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        for (int row=1;row<=n;row++){
            int total_col=row>(n+1)/2 ? 2*(n+1)/2-row: row;

                if(row==(n+1)/2){
                    for (int col = 1; col<=(n-1)/2; col++) {
                        System.out.print(" * ");
                    }
                }
                else {
                    for (int space = 1; space <= (n - 1) / 2; space++) {
                        System.out.print("   ");
                    }
                }
                for (int col = 1; col <= total_col; col++) {
                    System.out.print(" * ");
                }
                System.out.println();

        }
    }
}
