import java.util.*;

public class a1_q10{

public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    while (n%2==0){
        n=n/2;
        System.out.print(2+" ");
    }
    for (int i=3; i<=Math.sqrt(n); i++){
        while(n%i==0){
            System.out.print(i+" " );
            n=n/i;
        }
        i=i+2;
    }
    if (n>2){
        System.out.print(n+" " );
    }
 }
}
