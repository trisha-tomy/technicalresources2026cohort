import java.util.Scanner;

public class a2_q14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        for (int i = 1; i <=10; i++) {
            System.out.println(n+"*"+i+"="+n*i);

        }
    }
}


