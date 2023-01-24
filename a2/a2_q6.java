import java.util.Scanner;

public class a2_q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }

    static void pattern(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int total_spaces=row>n?2*n-row:row-1;
            int asterisks=n-total_spaces;
            for (int asterisk = 0; asterisk < asterisks; asterisk++) {
                System.out.print(" * ");
            }

            for (int space = 1; space <=total_spaces ; space++) {
                System.out.print("   ");

            }

            for (int space = 1; space <=total_spaces ; space++) {
                System.out.print("   ");

            }

            for (int asterisk = 0; asterisk < asterisks; asterisk++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
