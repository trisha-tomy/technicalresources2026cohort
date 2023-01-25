import java.util.Scanner;

public class a2_q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        int temp,num=0,num_next=1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num+" ");
                temp=num;
                num=num_next;
                num_next=num_next+temp;

            }
            System.out.println();
        }
    }


}
