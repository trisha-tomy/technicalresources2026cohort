import java.util.*;

public class a1_q7{

public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int num=n;
    int count=0;
    double inv=0;
    int rem=0;
    while(num>0){
        if (rem>=0){
        rem=num%10;
        count++;
        inv=inv +count*(Math.pow(10,rem-1));
        num=num/10;
        }
        System.out.println(inv);
        
    }
    
    System.out.println(inv);
 }
}
